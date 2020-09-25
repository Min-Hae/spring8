package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import pack.controller.MemBean;

public interface MemAnnoInter {
	@Select("select num, name, addr from mem")
	public List<MemDto> getDataAll();
	@Select("select num, name, addr from mem where num=#{num}")
	public MemDto selectPart();
	@Select("insert into mem values(#{num}, #{name}, #{addr})")
	public int insertData(MemBean bean);
	@Select("update mem set name=#{name}, addr=#{addr} where num=#{num}")
	public int updateData(MemBean bean);
	@Select("delete from mem where num=#{num}")
	public int deleteData(MemBean bean);

}
