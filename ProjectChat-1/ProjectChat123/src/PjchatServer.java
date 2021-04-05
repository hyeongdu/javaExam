import java.util.*;
import java.io.*;
import java.net.*;
import java.sql.SQLIntegrityConstraintViolationException;



public class PjchatServer
{
	Map<String, PrintWriter> room1;
	
	ProjectChat pjsql = new ProjectChat(room1);
	ServerSocket serverSocket = null;
	Socket socket = null;

	
//로그인 회원가입 변수 
	
//모두에게 보내기 
	

	

	
	public PjchatServer()
	{
		room1 = new HashMap<String, PrintWriter>();
		Collections.synchronizedMap(room1);
		
	}
	public void init()
	{
		try
		{
			serverSocket = new ServerSocket(9999);
			System.out.println("서버가 시작되었습니다");
			
			while(true)
			{	
				socket = serverSocket.accept();
				System.out.println(socket.getInetAddress() + " : " + socket.getPort());
	
				Thread msr = new MultiServerT(socket);
				msr.start();
			}
			

			
		}catch(Exception e)
		{
			System.out.println("서버 접속 오류" + e);
		}finally
		{
			try
			{
				serverSocket.close();
			}catch (Exception e )
			{
				System.out.println(" 서버 종료 오류" + e);
			}
		}
	}
	
	
	
	boolean start = true;
	
	public static void main(String[] args)
	{
		PjchatServer pjs = new PjchatServer();
		pjs.init();
		
	}
	class MultiServerT extends Thread
	{	
		Socket socket;
		PrintWriter out = null;
		BufferedReader in = null;
		String name = "";
		
		
	
		public MultiServerT(Socket socket)
		{
			this.socket = socket;
			try {
				out = new PrintWriter(this.socket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			
			}
			catch(Exception e)
			{
				System.out.println("예외 : " + e);
			
			}
		}
	
		public void run()
		{
			
			String s = "";
			try {
					while(start)
					{
						out.println("서버에 오신걸 환영합니다.");
						out.println("1. 로그인");
						out.println("2. 회원가입");
					
						s = in.readLine();
						switch(s)
						{	
						case "1":
							out.println(s + "번을 누르셨습니다 로그인하겠습니다.");
							login();
							start = false;
							break;
						
					
						case "2":
							out.println(s + "번을 누르셨습니다 회원가입.");
							joinchat();
							start = false;
							break;
						}
						
						
					}
					start = true;
					room1.put(name, out);
					pjsql.welcome(name);
					System.out.println("대기방 인원 : " + room1.size());
//					roomAllMsg(name +"님이 대기방에 입장하셨습니다", "");
					out.println("/help를 입력하시면 명령어를 보실 수 있습니다. ");
					while(in!=null)
					{	
						s = in.readLine();
						System.out.println(name + ">" +s);
						try
						{
							if(s.charAt(0) == '/')
							{
								StringTokenizer st = new StringTokenizer(s, " ");
							
								String stz = st.nextToken();
								if(stz.equals("/list"))
								{
//									list(name);
								}
								else if(stz.equals("/help"))
								{
									help();
								}
								else if(stz.equals("/to"))
								{
									String stz2 = st.nextToken();
									s = st.nextToken();
									oneMsg(s,stz2);
									
								}
								else if(stz.equals("/enter"))
								{
									enterroom(st.nextToken(), st.nextToken());
								}
								else if(stz.equals("/add"))
								{
									
									addroom(st.nextToken(), st.nextToken());
									
								}
								else if (stz.equals("/NPC"))
								{
									out.println(npc(st.nextToken(), name));
								}
								else if(stz.equals("/addblack"))
								{
									out.println(addblack(name, st.nextToken()));
								}
								else if(stz.equals("/delblack"))
								{
									out.println(delblack(name, st.nextToken()));
								}
								else if (stz.equals("/notice"))
								{
									chatAllMsg(st.nextToken());
								}
								else if(stz.equals("/exit"))
								{
									exit();
									out.println("대기방으로 이동");
								}
								else if(stz.equals("/end"))
								{
									
									pjsql.end(name);
									out.println("종료합니다.");
									break;
								}
								else 
								{
									out.println("잘못된 명령어입니다.");
								}
							}
							else
							room1Msg(s,name);
						}catch(StringIndexOutOfBoundsException sib)
						{
							continue;
						}catch(Exception e)
						{
							System.out.println("서버채팅 오류" + e);
						}

					}
					
				}catch(Exception e)
				{
						System.out.println("서버 접속 오류" + e);
				}finally
				{
					try
					{
					in.close();
					out.close();
					socket.close();
					room1.remove(name);
					}catch (Exception e )
					{
						System.out.println(" 서버 종료 오류" + e);
							
					}
				}
				
		}
		
		
		public void login()
		{
			boolean login = true;
			String password = "";
			String a ="";
			String b = "";
			try {
			while(login)
				{
					out.println("아이디와 비밀번호를 입력해주세요");
					a = in.readLine();
					name = a ;
					out.println("아이디 : " + a);
					out.println("비밀번호 입력하세요");
					b = in.readLine();
					out.println("비밀번호 : " + b);
					password  = b ;
					String result = pjsql.loginMenu(name, password);
					out.println(result);
					if(result.equals("로그인"))
					{
						this.name = name;
						login = false;
					}
					else
					{
						out.println("실패");
						login = true;
					}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void joinchat()
		{
			String name = "";
			String password = "";
			String a ="";
			String b = "";
			boolean join = true;
		try {
			
			while(join)
				{	
					out.println("회원가입 - 아이디와 비밀번호를 입력하세요.");
					a = in.readLine();
					out.println("아이디 : " + a);
					name = a;
					a = in.readLine();
					out.println("비밀번호 : " + a);
					password = a;
					String result = pjsql.joinchat(name,password);
					out.println(result);
					if(result.equals("회원가입 완료"))
					{
						out.println("로그인");
						join = false;
					}
				}
				}catch(Exception e)
				{
					System.out.println("회원가입 오류" + e);
				}
		}
		public void exit()
		{
			pjsql.exitDb(name);
			out.println("대기방으로 이동");
		}
		public void chatAllMsg(String msg)
		{
			if(pjsql.npccheck(name) == true)
			{
				String notice = "                                       *공지사항* ";
				String space = "                               ";
				Iterator it2 = room1.keySet().iterator();
				
				
				while(it2.hasNext())
				{
					try
					{
						PrintWriter it_out = (PrintWriter)room1.get(it2.next());
						
							it_out.println(notice);
							it_out.println(space + msg);
						
					}catch(Exception e)
					{
						System.out.println("예외 : " + e );
					}
				}
			}
			else
			{
				out.println("관리자 권한이 없습니다.");
			}
		}
		
	
		public void oneMsg(String msg, String stz2)

		
		{
				try
				{
					PrintWriter it_out = (PrintWriter)room1.get(stz2);
					it_out.println(name+ "님의 귓속말" + ">" + msg);
				}catch(Exception e)
				{
					System.out.println("예외 : " + e );
				}
			
			
			
		}
		public void room1Msg(String msg, String name)
		{
			
			
			pjsql.sendAllchat(msg, name);
			
			
		}
		
		
//		public void list(String name)
//		{
////			ArrayList<String> array = pjsql.sendAllchat(name);
//			
//			Iterator<String> it = array.iterator();
//			String msg = "사용자 리스트 [";
//			while(it.hasNext())
//			{
//				msg+= it.next() + ",";
//				
//			}
//			msg = msg.substring(0, msg.length()-1) + "]";
//			
//			try
//			{
//				out.println(msg);
//			}catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
		
		
		
		public void help()
		{
			out.println("/list : 현재 있는 방에 인원을 보실 수 있습니다. ");
			out.println("/help : 명령어를 보실 수 있습니다. ");
			out.println("/add :  방을 만드실 수 있습니다.  ");
			out.println("/to 상대방 내용 : 귓속말을 보내실 수 있습니다. ");
			out.println("/enter : 개설된 방에 입장하실 수 있습니다. ");
		}
		
		public void addroom(String roomname, String password)
		{	
			
			try
			{
				
				
					String result = pjsql.addroom(name,roomname,password);
					out.println(result);
					if(result.equals("방개설"))
					{
						
						out.println(roomname + "방 개설");
						
						
						
					}
					else
					{
						out.print("중복된 방 이름입니다. ");
						out.print("다시 입력해주세요");
					}
				
			}catch(Exception e)
			{
				System.out.println("방만들기 오류(server)" + e);
			}
		
		}
		public void enterroom(String roomname, String password)
		{
			
				try
				{
					
					out.println("방 : " + roomname);
					out.println("비밀번호 : " + password);
					
					String result = pjsql.enterroom(name, roomname, password);
					out.println(result);
					if(result.equals("방입장"))
					{
						out.print(start);
					}
					else
					{
						out.println("방이름 또는 비밀번호가 맞지않습니다.");
					}
				}catch(Exception e)
				{
					System.out.println("방 들어가기 오류" + e);
				}
				
		
		}
		public String npc(String password,String name)
		{
			 return pjsql.npcDb(password, name);	
		}
		public String addblack(String name ,String blackname)
		{
			if (pjsql.npccheck(name) == true)
				return pjsql.addblacklist(blackname);
			else
				return "권한이 없습니다.";
		}
		public String delblack(String name, String blackname)
		{
			if (pjsql.npccheck(name) == true)
				return pjsql.delblacklist(blackname);
			else
				return "권한이 없습니다.";
		}
		
	}

}	

