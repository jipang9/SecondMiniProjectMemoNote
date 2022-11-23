package memo.repository;

import memo.Memo;

import java.util.ArrayList;

public interface MemoRepository {

    Memo getOne(int memoId);

    ArrayList<Memo> getList();

    void saveMemo(Memo memo);

    void delOne(int memoId);

}
