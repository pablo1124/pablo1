package tool;

public class Tool {
    String toolType;
    public void useTool() {
        System.out.println("używamy" + toolType);
    }

    public Tool(String toolType) {
        this.toolType = toolType;
    }
}
