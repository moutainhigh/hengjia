package com.baibei.hengjia.api.modules.account.service;
import com.baibei.hengjia.api.modules.account.bean.dto.ChangeCouponAccountDto;
import com.baibei.hengjia.api.modules.account.bean.dto.RecordDto;
import com.baibei.hengjia.api.modules.account.bean.vo.RecordVo;
import com.baibei.hengjia.api.modules.account.model.CouponAccount;
import com.baibei.hengjia.api.modules.account.model.RecordCouponThaw;
import com.baibei.hengjia.common.core.mybatis.Service;
import com.baibei.hengjia.common.tool.page.MyPageInfo;


/**
* @author: hyc
* @date: 2019/10/14 11:13:00
* @description: RecordCouponThaw服务接口
*/
public interface IRecordCouponThawService extends Service<RecordCouponThaw> {

    void insertOne(ChangeCouponAccountDto changeCouponAccountDto, CouponAccount couponAccount);

    MyPageInfo<RecordVo> getAll(RecordDto recordCouponDto);
}
