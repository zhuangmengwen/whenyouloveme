public class TestJVM {

    public static void main(String[] args) {
        // java -Djvm=Hello Main 设置环境变量
        // Hello
        String jvm = System.getProperty("jvm");
        System.out.println(jvm);
        if (jvm == null) {
            System.out.println("test-jvm");
        } else {
            System.out.println(jvm);
        }
        System.out.println("测试一下git的提交");
    }
}
