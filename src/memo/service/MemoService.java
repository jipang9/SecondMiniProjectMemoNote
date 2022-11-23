package memo.service;

import memo.Memo;

import java.util.ArrayList;

public interface MemoService {

    Memo getOne();

    ArrayList<Memo> getList();

    void saveMemo();

    void modifyMemo();

    void delMemo();

}
