public class TextBuilder extends Builder {
    private String text = "";

    @Override
    public void makeTitle(String title) {
        text += "==============================\n";
        text += "[" + title + "]\n";
        text += "\n";
    }

    @Override
    public void makeString(String str) {
        text += "■" + str + "\n";
        text += "\n";
    }

    @Override
    public void makeItems(String[] items) {
        for (String s: items) {
            text += "　- " + s + "\n";
        }
        text += "\n";
    }

    @Override
    public void close() {
        text += "==============================\n";
    }

    public String getTextResult() {
        return text;
    }
}
