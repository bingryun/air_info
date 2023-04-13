package api_dev_0.air_info.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class ApiExplorerData {

    private String stnId;
    private String tm;
    private String stnNm;
    private String rnum;
    private String m03Te;
    private String m02Te;
    private String m01Te;
    private String m005Te;
    private String ts;
    private String dmstMtphNo;
    private String gndSttCd;
    private String vs;
    private String lcsCh;
    private String clfmAbbrCd;
    private String dc10LmcsCa;
    private String dc10Tca;
    private String hr3Fhsc;
    private String dsnw;
    private String icsr;
    private String ss;
    private String ssQcflag;
    private String ps;
    private String psQcflag;
    private String pa;
    private String paQcflag;
    private String td;
    private String pv;
    private String hm;
    private String hmQcflag;
    private String wd;
    private String wdQcflag;
    private String ws;
    private String wsQcflag;
    private String rn;
    private String rnQcflag;
    private String ta;
    private String taQcflag;
    private String tsQcflg;

    // 생성자
    public ApiExplorerData(String stnId, String tm, String stnNm, String rnum, String m03Te, String m02Te, String m01Te, String m005Te, String ts, String dmstMtphNo, String gndSttCd, String vs, String lcsCh, String clfmAbbrCd, String dc10LmcsCa, String dc10Tca, String hr3Fhsc, String dsnw, String icsr, String ss, String ssQcflag, String ps, String psQcflag, String pa, String paQcflag, String td, String pv, String hm, String hmQcflag, String wd, String wdQcflag, String ws, String wsQcflag, String rn, String rnQcflag, String ta, String taQcflag, String tsQcflg) {
        this.stnId = stnId;
        this.tm = tm;
        this.stnNm = stnNm;
        this.rnum = rnum;
        this.m03Te = m03Te;
        this.m02Te = m02Te;
        this.m01Te = m01Te;
        this.m005Te = m005Te;
        this.ts = ts;
        this.dmstMtphNo = dmstMtphNo;
        this.gndSttCd = gndSttCd;
        this.vs = vs;
        this.lcsCh = lcsCh;
        this.clfmAbbrCd = clfmAbbrCd;
        this.dc10LmcsCa = dc10LmcsCa;
        this.dc10Tca = dc10Tca;
        this.hr3Fhsc = hr3Fhsc;
        this.dsnw = dsnw;
        this.icsr = icsr;
        this.ss = ss;
        this.ssQcflag = ssQcflag;
        this.ps = ps;
        this.psQcflag = psQcflag;
        this.pa = pa;
        this.paQcflag = paQcflag;
        this.td = td;
        this.pv = pv;
        this.hm = hm;
        this.hmQcflag = hmQcflag;
        this.wd = wd;
        this.wdQcflag = wdQcflag;
        this.ws = ws;
        this.wsQcflag = wsQcflag;
        this.rn = rn;
        this.rnQcflag = rnQcflag;
        this.ta = ta;
        this.taQcflag = taQcflag;
        this.tsQcflg = tsQcflg;
    }


    // Getters and Setters
    public String getStnId() {
        return stnId;
    }

    public String getTm() {
        return tm;
    }

    public String getStnNm() {
        return stnNm;
    }

    public String getRnum() {
        return rnum;
    }

    public String getM03Te() {
        return m03Te;
    }

    public String getM02Te() {
        return m02Te;
    }

    public String getM01Te() {
        return m01Te;
    }

    public String getM005Te() {
        return m005Te;
    }

    public String getTs() {
        return ts;
    }

    public String getDmstMtphNo() {
        return dmstMtphNo;
    }

    public String getGndSttCd() {
        return gndSttCd;
    }

    public String getVs() {
        return vs;
    }

    public String getLcsCh() {
        return lcsCh;
    }

    public String getClfmAbbrCd() {
        return clfmAbbrCd;
    }

    public String getDc10LmcsCa() {
        return dc10LmcsCa;
    }

    public String getDc10Tca() {
        return dc10Tca;
    }

    public String getHr3Fhsc() {
        return hr3Fhsc;
    }

    public String getDsnw() {
        return dsnw;
    }

    public String getIcsr() {
        return icsr;
    }

    public String getSs() {
        return ss;
    }

    public String getSsQcflag() {
        return ssQcflag;
    }

    public String getPs() {
        return ps;
    }

    public String getPsQcflag() {
        return psQcflag;
    }

    public String getPa() {
        return pa;
    }

    public String getPaQcflag() {
        return paQcflag;
    }

    public String getTd() {
        return td;
    }

    public String getPv() {
        return pv;
    }

    public String getHm() {
        return hm;
    }

    public String getHmQcflag() {
        return hmQcflag;
    }

    public String getWd() {
        return wd;
    }

    public String getWdQcflag() {
        return wdQcflag;
    }

    public String getWs() {
        return ws;
    }

    public String getWsQcflag() {
        return wsQcflag;
    }

    public String getRn() {
        return rn;
    }

    public String getRnQcflag() {
        return rnQcflag;
    }

    public String getTa() {
        return ta;
    }

    public String getTaQcflag() {
        return taQcflag;
    }

    public String getTsQcflg() {
        return tsQcflg;
    }

    // set 메서드
    public void setStnId(String stnId) {
        this.stnId = stnId;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public void setStnNm(String stnNm) {
        this.stnNm = stnNm;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
    }

    public void setM03Te(String m03Te) {
        this.m03Te = m03Te;
    }

    public void setM02Te(String m02Te) {
        this.m02Te = m02Te;
    }

    public void setM01Te(String m01Te) {
        this.m01Te = m01Te;
    }

    public void setM005Te(String m005Te) {
        this.m005Te = m005Te;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setDmstMtphNo(String dmstMtphNo) {
        this.dmstMtphNo = dmstMtphNo;
    }

    public void setGndSttCd(String gndSttCd) {
        this.gndSttCd = gndSttCd;
    }

    public void setVs(String vs) {
        this.vs = vs;
    }

    public void setLcsCh(String lcsCh) {
        this.lcsCh = lcsCh;
    }

    public void setClfmAbbrCd(String clfmAbbrCd) {
        this.clfmAbbrCd = clfmAbbrCd;
    }

    public void setDc10LmcsCa(String dc10LmcsCa) {
        this.dc10LmcsCa = dc10LmcsCa;
    }

    public void setDc10Tca(String dc10Tca) {
        this.dc10Tca = dc10Tca;
    }

    public void setHr3Fhsc(String hr3Fhsc) {
        this.hr3Fhsc = hr3Fhsc;
    }

    public void setDsnw(String dsnw) {
        this.dsnw = dsnw;
    }

    public void setIcsr(String icsr) {
        this.icsr = icsr;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public void setSsQcflag(String ssQcflag) {
        this.ssQcflag = ssQcflag;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public void setPsQcflag(String psQcflag) {
        this.psQcflag = psQcflag;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public void setPaQcflag(String paQcflag) {
        this.paQcflag = paQcflag;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public void setHm(String hm) {
        this.hm = hm;
    }

    public void setHmQcflag(String hmQcflag) {
        this.hmQcflag = hmQcflag;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public void setWdQcflag(String wdQcflag) {
        this.wdQcflag = wdQcflag;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public void setWsQcflag(String wsQcflag) {
        this.wsQcflag = wsQcflag;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }

    public void setRnQcflag(String rnQcflag) {
        this.rnQcflag = rnQcflag;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public void setTaQcflag(String taQcflag) {
        this.taQcflag = taQcflag;
    }

    public void setTsQcflg(String tsQcflg) {
        this.tsQcflg = tsQcflg;
    }

    // 저장을 위한 SQL 쿼리를 생성하는 메소드
    public String toSqlInsertQuery() {
        String[] columns = {"STTN_ID", "TIME", "STTN_NM", "ORDR_LIST", "30UG_TEMP", "20UG_TEMP", "10UG_TEMP", "5UG_TEMP", "SRFC_TEMP", "PHNM_NUM", "GRND_STT_CD", "VISB", "LWST_CLD_HT", "CLD_FRM_CD", "MID_LOW_CLD_COVR_AMT", "TOT_CLD_COVR_AMNT", "3HR_NEW_SNOW_DEPT", "SNOW_DEPT", "SNSH_DUR", "SNSH_AMT", "SNSH_QC_FLAG", "SL_PRES", "SL_PRES_QC_FLAG", "LCL_PRES", "LCL_PRES_QC_FLAG", "DW_PT_TEMP", "WTR_VAP_PRES", "HUMIDITY", "HUMIDITY_QC_FLAG", "WND_DIRN", "WND_DIRN_QC_FLAG", "WND_SPD", "WND_SPD_QC_FLAG", "PRECIP_AMT", "PRECIP_AMT_QC_FLAG", "TEMP", "TEMP_QC_FLAG", "SRFC_TEMP_QC_FLAG"};

        String values =
                prepareValue(getStnId()) + "," +
                prepareValue(getTm()) + "," +
                prepareValue(getStnNm()) + "," +
                prepareValue(getRnum()) + "," +
                prepareValue(getM03Te()) + "," +
                prepareValue(getM02Te()) + "," +
                prepareValue(getM01Te()) + "," +
                prepareValue(getM005Te()) + "," +
                prepareValue(getTs()) + "," +
                prepareValue(getDmstMtphNo()) + "," +
                prepareValue(getGndSttCd()) + "," +
                prepareValue(getVs()) + "," +
                prepareValue(getLcsCh()) + "," +
                prepareValue(getClfmAbbrCd()) + "," +
                prepareValue(getDc10LmcsCa()) + "," +
                prepareValue(getDc10Tca()) + "," +
                prepareValue(getHr3Fhsc()) + "," +
                prepareValue(getDsnw()) + "," +
                prepareValue(getIcsr()) + "," +
                prepareValue(getSs()) + "," +
                prepareValue(getSsQcflag()) + "," +
                prepareValue(getPs()) + "," +
                prepareValue(getPsQcflag()) + "," +
                prepareValue(getPa()) + "," +
                prepareValue(getPaQcflag()) + "," +
                prepareValue(getTd()) + "," +
                prepareValue(getPv()) + "," +
                prepareValue(getHm()) + "," +
                prepareValue(getHmQcflag()) + "," +
                prepareValue(getWd()) + "," +
                prepareValue(getWdQcflag()) + "," +
                prepareValue(getWs()) + "," +
                prepareValue(getWsQcflag()) + "," +
                prepareValue(getRn()) + "," +
                prepareValue(getRnQcflag()) + "," +
                prepareValue(getTa()) + "," +
                prepareValue(getTaQcflag()) + "," +
                prepareValue(getTsQcflg()) ;


        return "INSERT INTO weather_data (" + String.join(",", columns) + ") VALUES (" + values + ")";
    }
    // 숫자형에서 null 인 경우 처리
    private String prepareValue(Object value) {
        if (value instanceof String) {
            String stringValue = (String) value;
            if (stringValue.isEmpty()) {
                return "NULL";
            } else if (isDatePattern(stringValue)) {
                return "'" + stringValue + "'";
            } else {
                return "'" + stringValue + "'";
            }
        }

        if (value == null || !isParsableAsNumber(value)) {
            return "NULL";
        } else if (value instanceof LocalDateTime) {
            return "'" + value.toString() + "'";
        } else {
            return value.toString();
        }
    }

    // 투입값이 숫자인지 아닌지 구분
    private boolean isParsableAsNumber(Object value) {
        if (value instanceof Number) {
            return true;
        }

        if (value instanceof String) {
            String stringValue = (String) value;
            if (isDatePattern(stringValue)) {
                return false;
            }
            try {
                Double.parseDouble(stringValue);
                return true;
            } catch (NumberFormatException e) {
                // Not a valid number
            }
        }
        return false;
    }

    private boolean isDatePattern(String value) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(value);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
