package uta.cse3310;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.freeutils.httpserver.HTTPServer;
import net.freeutils.httpserver.HTTPServer.ContextHandler;
import net.freeutils.httpserver.HTTPServer.FileContextHandler;
import net.freeutils.httpserver.HTTPServer.Request;
import net.freeutils.httpserver.HTTPServer.Response;
import net.freeutils.httpserver.HTTPServer.VirtualHost;

public class HttpServerImplementation
{

  int port;
  String dirname;

    public HttpServerImplementation(int port, String dirName) {
        System.out.println("creating http server port " + port);
        this.port = port;
        this.dirname = dirName;
    }

    public void start() {

        System.out.println("In http server impl start\n");
        
        try
        {
            File dir = new File(dirname);

            //RM
            System.out.println("Path to default html: " + dir.getAbsolutePath());

            if (!dir.canRead()) throw new FileNotFoundException(dir.getAbsolutePath());
            
            // set up server
            HTTPServer server = new HTTPServer(port);
            VirtualHost host  = server.getVirtualHost(null); // default host
            host.setAllowGeneratedIndex(true); // with directory index pages

            host.addContext("/", new FileContextHandler(new File(dir.getAbsolutePath())));

            host.addContext("/css",  new FileContextHandler(new File("./css")));

            host.addContext("/js",  new FileContextHandler(new File("./js")));


            host.addContext("/api/time", new ContextHandler() {
                public int serve(Request req, Response resp) throws IOException
                {
                    long now = System.currentTimeMillis();
                    resp.getHeaders().add("Content-Type", "text/plain");
                    resp.send(200, String.format("%tF %<tT", now));
                    return 0;
                }
            });

            server.start();
            System.out.println("HTTPServer is listening on port: " + port);
        } catch (Exception e) {
            System.err.println("error: " + e);
        }

    }

}
