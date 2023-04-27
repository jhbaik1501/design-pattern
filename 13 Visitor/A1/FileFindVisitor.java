import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {
    private String filetype;
    private List<File> foundFiles = new ArrayList<>();

    // ".txt"처럼 확장자를 피리어드(.)를 붙여 지정
    public FileFindVisitor(String filetype) {
        this.filetype = filetype;
    }

    // 발견한 파일을 가져온다
    public Iterable<File> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(filetype)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (Entry entry: directory) {
            entry.accept(this);
        }
    }
}
