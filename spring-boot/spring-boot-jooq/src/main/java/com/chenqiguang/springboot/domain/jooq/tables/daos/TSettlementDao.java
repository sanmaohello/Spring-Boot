/*
 * This file is generated by jOOQ.
*/
package com.chenqiguang.springboot.domain.jooq.tables.daos;


import com.chenqiguang.springboot.domain.jooq.tables.TSettlement;
import com.chenqiguang.springboot.domain.jooq.tables.pojos.TSettlementObj;
import com.chenqiguang.springboot.domain.jooq.tables.records.TSettlementRecord;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 结算单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class TSettlementDao extends DAOImpl<TSettlementRecord, TSettlementObj, String> {

    /**
     * Create a new TSettlementDao without any configuration
     */
    public TSettlementDao() {
        super(TSettlement.T_SETTLEMENT, TSettlementObj.class);
    }

    /**
     * Create a new TSettlementDao with an attached configuration
     */
    @Autowired
    public TSettlementDao(Configuration configuration) {
        super(TSettlement.T_SETTLEMENT, TSettlementObj.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(TSettlementObj object) {
        return object.getSettlementId();
    }

    /**
     * Fetch records that have <code>SETTLEMENT_ID IN (values)</code>
     */
    public List<TSettlementObj> fetchBySettlementId(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SETTLEMENT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>SETTLEMENT_ID = value</code>
     */
    public TSettlementObj fetchOneBySettlementId(String value) {
        return fetchOne(TSettlement.T_SETTLEMENT.SETTLEMENT_ID, value);
    }

    /**
     * Fetch records that have <code>SETTLEMENT_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchBySettlementNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SETTLEMENT_NO, values);
    }

    /**
     * Fetch records that have <code>RULE_ID IN (values)</code>
     */
    public List<TSettlementObj> fetchByRuleId(Long... values) {
        return fetch(TSettlement.T_SETTLEMENT.RULE_ID, values);
    }

    /**
     * Fetch records that have <code>SETTLEMENT_PERIOD IN (values)</code>
     */
    public List<TSettlementObj> fetchBySettlementPeriod(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SETTLEMENT_PERIOD, values);
    }

    /**
     * Fetch records that have <code>BUSINESS_BILL_TYPE IN (values)</code>
     */
    public List<TSettlementObj> fetchByBusinessBillType(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.BUSINESS_BILL_TYPE, values);
    }

    /**
     * Fetch records that have <code>INVOICE_TYPE IN (values)</code>
     */
    public List<TSettlementObj> fetchByInvoiceType(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.INVOICE_TYPE, values);
    }

    /**
     * Fetch records that have <code>ACCORDING_RULE IN (values)</code>
     */
    public List<TSettlementObj> fetchByAccordingRule(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.ACCORDING_RULE, values);
    }

    /**
     * Fetch records that have <code>PREDICT_INVOICE_DATE IN (values)</code>
     */
    public List<TSettlementObj> fetchByPredictInvoiceDate(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PREDICT_INVOICE_DATE, values);
    }

    /**
     * Fetch records that have <code>SELLER_TENANT_CODE IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerTenantCode(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_TENANT_CODE, values);
    }

    /**
     * Fetch records that have <code>SELLER_NO_AR IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerNoAr(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_NO_AR, values);
    }

    /**
     * Fetch records that have <code>SELLER_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_NO, values);
    }

    /**
     * Fetch records that have <code>SELLER_CODE IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerCode(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_CODE, values);
    }

    /**
     * Fetch records that have <code>SELLER_TAX_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerTaxNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_TAX_NO, values);
    }

    /**
     * Fetch records that have <code>SELLER_NAME IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerName(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_NAME, values);
    }

    /**
     * Fetch records that have <code>SELLER_ADDRESS IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerAddress(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>SELLER_TEL IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerTel(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_TEL, values);
    }

    /**
     * Fetch records that have <code>SELLER_BANK_NAME IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerBankName(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_BANK_NAME, values);
    }

    /**
     * Fetch records that have <code>SELLER_BANK_ACCOUNT IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerBankAccount(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_BANK_ACCOUNT, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_TENANT_CODE IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserTenantCode(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_TENANT_CODE, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_NO, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_NO_AR IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserNoAr(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_NO_AR, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_CODE IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserCode(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_CODE, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_TAX_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserTaxNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_TAX_NO, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_NAME IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserName(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_NAME, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_ADDRESS IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserAddress(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_TEL IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserTel(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_TEL, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_BANK_NAME IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserBankName(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_BANK_NAME, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_BANK_ACCOUNT IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserBankAccount(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_BANK_ACCOUNT, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_INVOICE_INFO_ID IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserInvoiceInfoId(Integer... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_INVOICE_INFO_ID, values);
    }

    /**
     * Fetch records that have <code>SELLER_INVOICE_INFO_ID IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerInvoiceInfoId(Integer... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_INVOICE_INFO_ID, values);
    }

    /**
     * Fetch records that have <code>PERINVOICE_AMOUNT_LIMIT IN (values)</code>
     */
    public List<TSettlementObj> fetchByPerinvoiceAmountLimit(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.PERINVOICE_AMOUNT_LIMIT, values);
    }

    /**
     * Fetch records that have <code>OTHER_PLAT_ACCOUNT IN (values)</code>
     */
    public List<TSettlementObj> fetchByOtherPlatAccount(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.OTHER_PLAT_ACCOUNT, values);
    }

    /**
     * Fetch records that have <code>CUSTOM_BILL_TYPE IN (values)</code>
     */
    public List<TSettlementObj> fetchByCustomBillType(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.CUSTOM_BILL_TYPE, values);
    }

    /**
     * Fetch records that have <code>AMOUNT_WITHOUT_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAmountWithoutTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.AMOUNT_WITHOUT_TAX, values);
    }

    /**
     * Fetch records that have <code>TAX_AMOUNT IN (values)</code>
     */
    public List<TSettlementObj> fetchByTaxAmount(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.TAX_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>AMOUNT_WITH_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAmountWithTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.AMOUNT_WITH_TAX, values);
    }

    /**
     * Fetch records that have <code>CAN_MAKE_INVOICE_AMOUNT_WITH_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByCanMakeInvoiceAmountWithTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.CAN_MAKE_INVOICE_AMOUNT_WITH_TAX, values);
    }

    /**
     * Fetch records that have <code>ALREADY_INVOICE_AMOUNT_WITH_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyInvoiceAmountWithTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_INVOICE_AMOUNT_WITH_TAX, values);
    }

    /**
     * Fetch records that have <code>ALREADY_AUTH_AMOUNT_WITH_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyAuthAmountWithTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_AUTH_AMOUNT_WITH_TAX, values);
    }

    /**
     * Fetch records that have <code>CAN_MAKE_INVOICE_AMOUNT_WITHOUT_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByCanMakeInvoiceAmountWithoutTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.CAN_MAKE_INVOICE_AMOUNT_WITHOUT_TAX, values);
    }

    /**
     * Fetch records that have <code>ALREADY_INVOICE_AMOUNT_WITHOUT_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyInvoiceAmountWithoutTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_INVOICE_AMOUNT_WITHOUT_TAX, values);
    }

    /**
     * Fetch records that have <code>ALREADY_AUTH_AMOUNT_WITHOUT_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyAuthAmountWithoutTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_AUTH_AMOUNT_WITHOUT_TAX, values);
    }

    /**
     * Fetch records that have <code>CAN_MAKE_INVOICE_TAX_AMOUNT IN (values)</code>
     */
    public List<TSettlementObj> fetchByCanMakeInvoiceTaxAmount(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.CAN_MAKE_INVOICE_TAX_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>ALREADY_INVOICE_TAX_AMOUNT IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyInvoiceTaxAmount(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_INVOICE_TAX_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>ALREADY_AUTH_TAX_AMOUNT IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyAuthTaxAmount(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_AUTH_TAX_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>ALREADY_PAY_TAX_AMOUNT IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyPayTaxAmount(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_PAY_TAX_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>ALREADY_PAY_AMOUNT_WITHOUT_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyPayAmountWithoutTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_PAY_AMOUNT_WITHOUT_TAX, values);
    }

    /**
     * Fetch records that have <code>ALREADY_PAY_AMOUNT_WIHT_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyPayAmountWihtTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_PAY_AMOUNT_WIHT_TAX, values);
    }

    /**
     * Fetch records that have <code>ALREADY_DEPOSE_AMOUNT_WITH_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyDeposeAmountWithTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_DEPOSE_AMOUNT_WITH_TAX, values);
    }

    /**
     * Fetch records that have <code>ALREADY_RED_AMOUNT_WITH_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByAlreadyRedAmountWithTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.ALREADY_RED_AMOUNT_WITH_TAX, values);
    }

    /**
     * Fetch records that have <code>DISCOUNT_WITHOUT_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByDiscountWithoutTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.DISCOUNT_WITHOUT_TAX, values);
    }

    /**
     * Fetch records that have <code>DISCOUNT_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByDiscountTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.DISCOUNT_TAX, values);
    }

    /**
     * Fetch records that have <code>DISCOUNT_WITH_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByDiscountWithTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.DISCOUNT_WITH_TAX, values);
    }

    /**
     * Fetch records that have <code>REMARK IN (values)</code>
     */
    public List<TSettlementObj> fetchByRemark(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.REMARK, values);
    }

    /**
     * Fetch records that have <code>APPEND_REMARK IN (values)</code>
     */
    public List<TSettlementObj> fetchByAppendRemark(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.APPEND_REMARK, values);
    }

    /**
     * Fetch records that have <code>PRE_INVOICE_NUMS IN (values)</code>
     */
    public List<TSettlementObj> fetchByPreInvoiceNums(Integer... values) {
        return fetch(TSettlement.T_SETTLEMENT.PRE_INVOICE_NUMS, values);
    }

    /**
     * Fetch records that have <code>CAN_MAKE_INVOICE_NUMS IN (values)</code>
     */
    public List<TSettlementObj> fetchByCanMakeInvoiceNums(Integer... values) {
        return fetch(TSettlement.T_SETTLEMENT.CAN_MAKE_INVOICE_NUMS, values);
    }

    /**
     * Fetch records that have <code>INVOICE_NUMS IN (values)</code>
     */
    public List<TSettlementObj> fetchByInvoiceNums(Integer... values) {
        return fetch(TSettlement.T_SETTLEMENT.INVOICE_NUMS, values);
    }

    /**
     * Fetch records that have <code>RECEIVE_CONFIRM_FLAG IN (values)</code>
     */
    public List<TSettlementObj> fetchByReceiveConfirmFlag(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.RECEIVE_CONFIRM_FLAG, values);
    }

    /**
     * Fetch records that have <code>UPLOAD_CONFIRM_FLAG IN (values)</code>
     */
    public List<TSettlementObj> fetchByUploadConfirmFlag(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.UPLOAD_CONFIRM_FLAG, values);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code>
     */
    public List<TSettlementObj> fetchByStatus(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.STATUS, values);
    }

    /**
     * Fetch records that have <code>ORIGIN_INVOICE_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchByOriginInvoiceNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.ORIGIN_INVOICE_NO, values);
    }

    /**
     * Fetch records that have <code>ORIGIN_INVOICE_CODE IN (values)</code>
     */
    public List<TSettlementObj> fetchByOriginInvoiceCode(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.ORIGIN_INVOICE_CODE, values);
    }

    /**
     * Fetch records that have <code>RED_NOTIFICATION_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchByRedNotificationNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.RED_NOTIFICATION_NO, values);
    }

    /**
     * Fetch records that have <code>ORDER_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchByOrderNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.ORDER_NO, values);
    }

    /**
     * Fetch records that have <code>CONTRACT_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchByContractNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.CONTRACT_NO, values);
    }

    /**
     * Fetch records that have <code>SYSTEM_ORIG IN (values)</code>
     */
    public List<TSettlementObj> fetchBySystemOrig(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SYSTEM_ORIG, values);
    }

    /**
     * Fetch records that have <code>SALES_BILL_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchBySalesBillNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SALES_BILL_NO, values);
    }

    /**
     * Fetch records that have <code>IS_NEED_AUTH IN (values)</code>
     */
    public List<TSettlementObj> fetchByIsNeedAuth(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.IS_NEED_AUTH, values);
    }

    /**
     * Fetch records that have <code>COOPERATE_FLAG IN (values)</code>
     */
    public List<TSettlementObj> fetchByCooperateFlag(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.COOPERATE_FLAG, values);
    }

    /**
     * Fetch records that have <code>REQUEST_SERIAL_NO IN (values)</code>
     */
    public List<TSettlementObj> fetchByRequestSerialNo(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.REQUEST_SERIAL_NO, values);
    }

    /**
     * Fetch records that have <code>PURCHASER_EMAIL IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurchaserEmail(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PURCHASER_EMAIL, values);
    }

    /**
     * Fetch records that have <code>LOGISTICS_STATUS IN (values)</code>
     */
    public List<TSettlementObj> fetchByLogisticsStatus(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.LOGISTICS_STATUS, values);
    }

    /**
     * Fetch records that have <code>CREATE_TIME IN (values)</code>
     */
    public List<TSettlementObj> fetchByCreateTime(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>CREATE_USER_ID IN (values)</code>
     */
    public List<TSettlementObj> fetchByCreateUserId(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>UPDATE_TIME IN (values)</code>
     */
    public List<TSettlementObj> fetchByUpdateTime(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>UPDATE_USER_ID IN (values)</code>
     */
    public List<TSettlementObj> fetchByUpdateUserId(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.UPDATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>SPECIAL_EXT1 IN (values)</code>
     */
    public List<TSettlementObj> fetchBySpecialExt1(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SPECIAL_EXT1, values);
    }

    /**
     * Fetch records that have <code>SPECIAL_EXT2 IN (values)</code>
     */
    public List<TSettlementObj> fetchBySpecialExt2(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.SPECIAL_EXT2, values);
    }

    /**
     * Fetch records that have <code>EXT1 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt1(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT1, values);
    }

    /**
     * Fetch records that have <code>EXT2 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt2(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT2, values);
    }

    /**
     * Fetch records that have <code>EXT3 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt3(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT3, values);
    }

    /**
     * Fetch records that have <code>EXT4 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt4(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT4, values);
    }

    /**
     * Fetch records that have <code>EXT5 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt5(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT5, values);
    }

    /**
     * Fetch records that have <code>EXT6 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt6(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT6, values);
    }

    /**
     * Fetch records that have <code>EXT7 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt7(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT7, values);
    }

    /**
     * Fetch records that have <code>EXT8 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt8(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT8, values);
    }

    /**
     * Fetch records that have <code>EXT9 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt9(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT9, values);
    }

    /**
     * Fetch records that have <code>EXT10 IN (values)</code>
     */
    public List<TSettlementObj> fetchByExt10(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.EXT10, values);
    }

    /**
     * Fetch records that have <code>UPLOAD_WAY IN (values)</code>
     */
    public List<TSettlementObj> fetchByUploadWay(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.UPLOAD_WAY, values);
    }

    /**
     * Fetch records that have <code>CASHIER_NAME IN (values)</code>
     */
    public List<TSettlementObj> fetchByCashierName(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.CASHIER_NAME, values);
    }

    /**
     * Fetch records that have <code>CHECKER_NAME IN (values)</code>
     */
    public List<TSettlementObj> fetchByCheckerName(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.CHECKER_NAME, values);
    }

    /**
     * Fetch records that have <code>INVOICER_NAME IN (values)</code>
     */
    public List<TSettlementObj> fetchByInvoicerName(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.INVOICER_NAME, values);
    }

    /**
     * Fetch records that have <code>LOCK_FLAG IN (values)</code>
     */
    public List<TSettlementObj> fetchByLockFlag(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.LOCK_FLAG, values);
    }

    /**
     * Fetch records that have <code>TAX_RATE IN (values)</code>
     */
    public List<TSettlementObj> fetchByTaxRate(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.TAX_RATE, values);
    }

    /**
     * Fetch records that have <code>USEING_STATUS IN (values)</code>
     */
    public List<TSettlementObj> fetchByUseingStatus(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.USEING_STATUS, values);
    }

    /**
     * Fetch records that have <code>PUR_ALREADY_AMOUNT_WITHOUT_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurAlreadyAmountWithoutTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.PUR_ALREADY_AMOUNT_WITHOUT_TAX, values);
    }

    /**
     * Fetch records that have <code>PUR_ALREADY_TAX_AMOUNT IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurAlreadyTaxAmount(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.PUR_ALREADY_TAX_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>PUR_ALREADY_AMOUNT_WITH_TAX IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurAlreadyAmountWithTax(BigDecimal... values) {
        return fetch(TSettlement.T_SETTLEMENT.PUR_ALREADY_AMOUNT_WITH_TAX, values);
    }

    /**
     * Fetch records that have <code>PRINT_CONTENT_FLAG IN (values)</code>
     */
    public List<TSettlementObj> fetchByPrintContentFlag(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PRINT_CONTENT_FLAG, values);
    }

    /**
     * Fetch records that have <code>SELLER_INVOICE_PERSON_INFO_ID IN (values)</code>
     */
    public List<TSettlementObj> fetchBySellerInvoicePersonInfoId(Integer... values) {
        return fetch(TSettlement.T_SETTLEMENT.SELLER_INVOICE_PERSON_INFO_ID, values);
    }

    /**
     * Fetch records that have <code>PUR_MACH_STATUS IN (values)</code>
     */
    public List<TSettlementObj> fetchByPurMachStatus(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.PUR_MACH_STATUS, values);
    }

    /**
     * Fetch records that have <code>RECIVE_USER IN (values)</code>
     */
    public List<TSettlementObj> fetchByReciveUser(String... values) {
        return fetch(TSettlement.T_SETTLEMENT.RECIVE_USER, values);
    }
}
