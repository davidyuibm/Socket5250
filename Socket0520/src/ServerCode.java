public class ServerCode
{
    public static void main(String[] argv)
    {
        new ServerThreadCode(8000).start();//建立物件，傳入Port並執行等待接受連線的動作
    }
}
