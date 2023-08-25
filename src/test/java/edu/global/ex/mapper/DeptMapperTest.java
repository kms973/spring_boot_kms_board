package edu.global.ex.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpDeptVO;

@SpringBootTest
class DeptMapperTest {

	@Autowired
	private DeptMapper deptMapper;

	@Test
	void testgetDeptEmpList() {
		assertNotNull(deptMapper);

		System.out.println(deptMapper.getDeptEmpList());

		for(DeptVO dept : deptMapper.getDeptEmpList()) {
		
			for (EmpDeptVO emp : dept.getEmpList()) {
				System.out.println(emp);
			}
		}
	}

}
