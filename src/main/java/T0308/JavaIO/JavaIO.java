package T0308.JavaIO;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by vip on 2018/3/8.
 */
public class JavaIO {
    /**
     * 文件IO，Socket 读写， Http post读取
     */

    /**
     * Input
     * Output
     * Reader
     * Writer
     * 日志，临时文件
     */

    public static void JavaIo() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(str);

        Console terminal = System.console();
        String username = terminal.readLine("UserName is :" );
        char[] passwd = terminal.readPassword("PassWd is :");
        //密码放在数组，用完之后可以重写擦除。

        //shell 系统重定向
        //启动时   java  package.MainClass  < input.txt  > output.txt




    }

    /**
     * IO体系：InputStream、OutputStream、Reade/Writer、文件读取，流读取
     */

    /**
     * NIO概念，具体使用方式及使用场景
     */
}
