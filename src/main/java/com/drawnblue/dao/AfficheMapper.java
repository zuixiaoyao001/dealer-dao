package com.drawnblue.dao;

import com.drawnblue.entity.Affiche;
import com.drawnblue.entity.AfficheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AfficheMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    long countByExample(AfficheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    int deleteByExample(AfficheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    int insert(Affiche record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    int insertSelective(Affiche record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    List<Affiche> selectByExampleWithBLOBs(AfficheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    List<Affiche> selectByExample(AfficheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    Affiche selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    int updateByExampleSelective(@Param("record") Affiche record, @Param("example") AfficheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Affiche record, @Param("example") AfficheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:11 CST 2019
     */
    int updateByExample(@Param("record") Affiche record, @Param("example") AfficheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(Affiche record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Affiche record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affiche
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(Affiche record);
}