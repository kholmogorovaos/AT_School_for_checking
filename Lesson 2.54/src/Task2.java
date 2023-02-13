public class Task2 {
    public static void main(String[] args) {
        String filePath = String.valueOf(args[0]);
        int splash = Math.max(filePath.lastIndexOf("/"), filePath.lastIndexOf("\\"));
        String path = filePath.substring(0, splash + 1);
        String fileName = filePath.substring(splash + 1);
        if (fileName.length() == 0) {
            System.out.println("Введен некорректный путь до файла.");
            return;
        }
        System.out.println("Путь: " + path);
        System.out.println("Имя файла: " + fileName);
    }
}
