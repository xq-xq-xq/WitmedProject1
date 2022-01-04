package com.whackon.witmed.system.hospital.pojo.VO;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 医院实体信息</b>
 *
 * @author Arthur
 * @version 1.0.0
 * @date 2022/1/4
 * @since 1.0.0
 */
@Data
public class Hospital extends BaseEntity {
	private static final long serialVersionUID = -7418587273850317256L;
	private String id;                              //主键
	private String name;                            //机构名称
	private String authority;                       //上级主管机构名称
	private String orgCode;                         //组织机构代码
	private String charge;                          //机构负责人
	private String addressCatCode;                  //标识地址类别的代码
	private String provence;                        //所在省
	private String city;                            //所在城市
	private String county;                          //所在区县
	private String town;                            //地址-乡（镇、街道办事处）
	private String village;                         //地址-村（街、路、弄等）
	private String doorNo;                          //地址-门牌号码
	private String zipCode;                         //邮政编码
	private String divisionCode;                    //行政区划代码
	private String telephoneCat;                    //联系电话-类别信息
	private String telephone;                       //联系电话-号码
	private String email;                           //电子邮件地址

}
