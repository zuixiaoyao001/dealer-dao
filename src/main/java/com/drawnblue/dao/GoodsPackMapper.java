package com.drawnblue.dao;

import com.drawnblue.entity.GoodsPack;
import com.drawnblue.entity.GoodsPackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    long countByExample(GoodsPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByExample(GoodsPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insert(GoodsPack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int insertSelective(GoodsPack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<GoodsPack> selectByExampleWithBLOBs(GoodsPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    List<GoodsPack> selectByExample(GoodsPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    GoodsPack selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") GoodsPack record, @Param("example") GoodsPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") GoodsPack record, @Param("example") GoodsPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByExample(@Param("record") GoodsPack record, @Param("example") GoodsPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeySelective(GoodsPack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(GoodsPack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pack
     *
     * @mbg.generated Sun Aug 04 18:07:12 CST 2019
     */
    int updateByPrimaryKey(GoodsPack record);
}