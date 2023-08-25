package edu.global.ex.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/* ORM : RDBMS <-> 자바 class mapping을 도와주는 framework
 * JPA : 일반 솔루션 회사
 * Mybatis : SI회사에서 많이 씀 
 * 
 * */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeptVO {

   private String deptno; // 부서번호
   private String dname; // 부서이름
   private String loc; // 이름

   
   //1:N 처리
   List<EmpDeptVO> empList;
}