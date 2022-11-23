package memo.service;

import memo.Memo;
import memo.repository.JavaMemoRepository;
import memo.repository.MemoRepository;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaMemoService implements MemoService{

    private final MemoRepository memoRepository = new JavaMemoRepository();
    int index =1;

    @Override
    public Memo getOne() {
        System.out.println("조회할 메모 번호를 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        int memoId = scanner.nextInt();

        return memoRepository.getOne(memoId);
    }

    @Override
    public void saveMemo() {
        LocalDateTime localDateTime = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.println("비밀번호를 입력하세요:");
        String password = scanner.nextLine();
        System.out.println("메모를 입력하세요:");
        String content = scanner.nextLine();
        Memo memo = new Memo(index,name, password, content,localDateTime);
        index++;
        memoRepository.saveMemo(memo);

        System.out.println("입력완료");
    }

    @Override
    public ArrayList<Memo> getList() {
        return memoRepository.getList();
    }


    @Override
    public void modifyMemo() {
        System.out.println("수정할 게시글을 선택하세요");
    }

    @Override
    public void delMemo() {
        System.out.println("삭제할 게시글을 선택하세요");
        Scanner scanner = new Scanner(System.in);
        int memoId = scanner.nextInt();
        memoRepository.delMemo(memoId);
    }


}
