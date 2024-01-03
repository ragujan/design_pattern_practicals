package com.rag.practicals.composite_pattern.test3;

public class Client {

    public static void main(String[] args) {
        Folder rootFolder = new Folder("root");

        Folder folderA = new Folder("folder A");
        File file1 = new File("file 1");
        File file2 = new File("file 2");

        folderA.add(file1);
        folderA.add(file2);

        Folder folderB = new Folder("folder B");
        File file3 = new File("file 3");
        File file4 = new File("file 4");
        Folder folderC = new Folder("folder C");
        File file5 = new File("file 5");
        File file6 = new File("file 6");
        folderC.add(file5);
        folderC.add(file6);


        folderB.add(file3);
        folderB.add(file4);
        folderB.add(folderC);


        folderA.add(folderB);

        rootFolder.add(folderA);

        rootFolder.showDetails();


    }
}
