package com.drawnblue.dao;

import com.drawnblue.entity.Function;
import com.drawnblue.entity.FunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    long countByExample(FunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByExample(FunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insert(Function record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insertSelective(Function record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<Function> selectByExample(FunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    Function selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") Function record, @Param("example") FunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExample(@Param("record") Function record, @Param("example") FunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(Function record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table au_function
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(Function record);
}