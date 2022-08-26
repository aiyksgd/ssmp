//package dic.util;
//
//
//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.webapp.WebAppContext;
//import org.springframework.stereotype.Component;
//
////@Component
//public class MainJetty {
//	public static void main(String[] args) throws Exception {
//
//		Server server = new Server(8081);// 端口
//		WebAppContext context = new WebAppContext();
//		context.setContextPath("/ssmp");// 显目名
//		context.setDescriptor("C:\\Users\\aiyk\\Desktop\\git\\ssmp\\src\\main\\webapp\\WEB-INF\\web.xml"); // war包的web.xml
//	//	context.setWar("C:/Users/Administrator/Desktop/springTest.war");// war包所在路径
//		context.setParentLoaderPriority(true);
//		server.setHandler(context);// 把项目放入jetty服务器
//		server.start();
//	}
//
//}