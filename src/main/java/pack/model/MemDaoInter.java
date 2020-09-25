package pack.model;

import java.util.List;
import pack.controller.MemBean;

public interface MemDaoInter {
	List<MemDto> getDataAll();
	MemDto selectPart(String num);
	boolean insData(MemBean bean);
	boolean upData(MemBean bean);
	boolean delData(String num);//삭제는 인자로 string

}
