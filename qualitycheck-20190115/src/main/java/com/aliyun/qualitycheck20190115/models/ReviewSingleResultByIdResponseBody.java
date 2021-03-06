// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ReviewSingleResultByIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ReviewSingleResultByIdResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ReviewSingleResultByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReviewSingleResultByIdResponseBody self = new ReviewSingleResultByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ReviewSingleResultByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReviewSingleResultByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReviewSingleResultByIdResponseBody setData(ReviewSingleResultByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReviewSingleResultByIdResponseBodyData getData() {
        return this.data;
    }

    public ReviewSingleResultByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReviewSingleResultByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase extends TeaModel {
        @NameInMap("Words")
        public String words;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Long end;

        @NameInMap("Role")
        public String role;

        public static ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase self = new ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord extends TeaModel {
        @NameInMap("From")
        public Integer from;

        @NameInMap("Val")
        public String val;

        @NameInMap("Tid")
        public String tid;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("To")
        public Integer to;

        public static ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord self = new ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords extends TeaModel {
        @NameInMap("KeyWord")
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> keyWord;

        public static ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords self = new ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords setKeyWord(java.util.List<ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> keyWord) {
            this.keyWord = keyWord;
            return this;
        }
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> getKeyWord() {
            return this.keyWord;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid extends TeaModel {
        @NameInMap("Cid")
        public java.util.List<String> cid;

        public static ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid self = new ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid setCid(java.util.List<String> cid) {
            this.cid = cid;
            return this;
        }
        public java.util.List<String> getCid() {
            return this.cid;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo extends TeaModel {
        @NameInMap("Phrase")
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase;

        @NameInMap("KeyWords")
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords;

        @NameInMap("Cid")
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid;

        public static ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo self = new ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setPhrase(ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase getPhrase() {
            return this.phrase;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setKeyWords(ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords getKeyWords() {
            return this.keyWords;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setCid(ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid) {
            this.cid = cid;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid getCid() {
            return this.cid;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList extends TeaModel {
        @NameInMap("ConditionHitInfo")
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> conditionHitInfo;

        public static ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList self = new ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList setConditionHitInfo(java.util.List<ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> conditionHitInfo) {
            this.conditionHitInfo = conditionHitInfo;
            return this;
        }
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> getConditionHitInfo() {
            return this.conditionHitInfo;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo extends TeaModel {
        @NameInMap("HitId")
        public String hitId;

        @NameInMap("Rid")
        public Long rid;

        public static ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo self = new ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setHitId(String hitId) {
            this.hitId = hitId;
            return this;
        }
        public String getHitId() {
            return this.hitId;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo extends TeaModel {
        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        @NameInMap("ConditionHitInfoList")
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("AutoReview")
        public Integer autoReview;

        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("ReviewInfo")
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo reviewInfo;

        @NameInMap("TotalNumber")
        public Integer totalNumber;

        @NameInMap("ScoreId")
        public Long scoreId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Rid")
        public Long rid;

        public static ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo self = new ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRuleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setConditionHitInfoList(ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList) {
            this.conditionHitInfoList = conditionHitInfoList;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList getConditionHitInfoList() {
            return this.conditionHitInfoList;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setAutoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }
        public Integer getAutoReview() {
            return this.autoReview;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setReviewInfo(ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo reviewInfo) {
            this.reviewInfo = reviewInfo;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoReviewInfo getReviewInfo() {
            return this.reviewInfo;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setScoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Long getScoreId() {
            return this.scoreId;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoList extends TeaModel {
        @NameInMap("HitRuleReviewInfo")
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> hitRuleReviewInfo;

        public static ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoList build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoList self = new ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoList();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoList setHitRuleReviewInfo(java.util.List<ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> hitRuleReviewInfo) {
            this.hitRuleReviewInfo = hitRuleReviewInfo;
            return this;
        }
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> getHitRuleReviewInfo() {
            return this.hitRuleReviewInfo;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataManualScoreMappingList extends TeaModel {
        @NameInMap("ManualScoreMappingList")
        public java.util.List<String> manualScoreMappingList;

        public static ReviewSingleResultByIdResponseBodyDataManualScoreMappingList build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataManualScoreMappingList self = new ReviewSingleResultByIdResponseBodyDataManualScoreMappingList();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataManualScoreMappingList setManualScoreMappingList(java.util.List<String> manualScoreMappingList) {
            this.manualScoreMappingList = manualScoreMappingList;
            return this;
        }
        public java.util.List<String> getManualScoreMappingList() {
            return this.manualScoreMappingList;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataDialoguesDialogue extends TeaModel {
        @NameInMap("Words")
        public String words;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Long end;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Role")
        public String role;

        @NameInMap("SilenceDuration")
        public Integer silenceDuration;

        @NameInMap("HourMinSec")
        public String hourMinSec;

        public static ReviewSingleResultByIdResponseBodyDataDialoguesDialogue build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataDialoguesDialogue self = new ReviewSingleResultByIdResponseBodyDataDialoguesDialogue();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setSilenceDuration(Integer silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        public ReviewSingleResultByIdResponseBodyDataDialoguesDialogue setHourMinSec(String hourMinSec) {
            this.hourMinSec = hourMinSec;
            return this;
        }
        public String getHourMinSec() {
            return this.hourMinSec;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataDialogues extends TeaModel {
        @NameInMap("Dialogue")
        public java.util.List<ReviewSingleResultByIdResponseBodyDataDialoguesDialogue> dialogue;

        public static ReviewSingleResultByIdResponseBodyDataDialogues build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataDialogues self = new ReviewSingleResultByIdResponseBodyDataDialogues();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataDialogues setDialogue(java.util.List<ReviewSingleResultByIdResponseBodyDataDialoguesDialogue> dialogue) {
            this.dialogue = dialogue;
            return this;
        }
        public java.util.List<ReviewSingleResultByIdResponseBodyDataDialoguesDialogue> getDialogue() {
            return this.dialogue;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam extends TeaModel {
        @NameInMap("ScoreSubName")
        public String scoreSubName;

        @NameInMap("ScoreNum")
        public Integer scoreNum;

        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        @NameInMap("ScoreType")
        public Integer scoreType;

        @NameInMap("Hit")
        public Integer hit;

        public static ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam self = new ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setScoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setScoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }
        public Integer getScoreType() {
            return this.scoreType;
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam setHit(Integer hit) {
            this.hit = hit;
            return this;
        }
        public Integer getHit() {
            return this.hit;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfos extends TeaModel {
        @NameInMap("ScoreParam")
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam> scoreParam;

        public static ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfos build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfos self = new ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfos();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfos setScoreParam(java.util.List<ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam> scoreParam) {
            this.scoreParam = scoreParam;
            return this;
        }
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfosScoreParam> getScoreParam() {
            return this.scoreParam;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo extends TeaModel {
        @NameInMap("ScoreInfos")
        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfos scoreInfos;

        @NameInMap("ScoreName")
        public String scoreName;

        @NameInMap("ScoreId")
        public Long scoreId;

        public static ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo self = new ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo setScoreInfos(ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfos scoreInfos) {
            this.scoreInfos = scoreInfos;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePoScoreInfos getScoreInfos() {
            return this.scoreInfos;
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo setScoreName(String scoreName) {
            this.scoreName = scoreName;
            return this;
        }
        public String getScoreName() {
            return this.scoreName;
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo setScoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Long getScoreId() {
            return this.scoreId;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyDataHandScoreInfoList extends TeaModel {
        @NameInMap("ScorePo")
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo> scorePo;

        public static ReviewSingleResultByIdResponseBodyDataHandScoreInfoList build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyDataHandScoreInfoList self = new ReviewSingleResultByIdResponseBodyDataHandScoreInfoList();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoList setScorePo(java.util.List<ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo> scorePo) {
            this.scorePo = scorePo;
            return this;
        }
        public java.util.List<ReviewSingleResultByIdResponseBodyDataHandScoreInfoListScorePo> getScorePo() {
            return this.scorePo;
        }

    }

    public static class ReviewSingleResultByIdResponseBodyData extends TeaModel {
        @NameInMap("AudioURL")
        public String audioURL;

        @NameInMap("HitNumber")
        public Integer hitNumber;

        @NameInMap("NextVid")
        public String nextVid;

        @NameInMap("PreVid")
        public String preVid;

        @NameInMap("IsAudio")
        public Boolean isAudio;

        @NameInMap("HitRuleReviewInfoList")
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList;

        @NameInMap("Audio")
        public Boolean audio;

        @NameInMap("AsrWordsCount")
        public Integer asrWordsCount;

        @NameInMap("TotalScore")
        public Integer totalScore;

        @NameInMap("BusinessType")
        public Integer businessType;

        @NameInMap("ManualScoreMappingList")
        public ReviewSingleResultByIdResponseBodyDataManualScoreMappingList manualScoreMappingList;

        @NameInMap("FileMergeName")
        public String fileMergeName;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("Dialogues")
        public ReviewSingleResultByIdResponseBodyDataDialogues dialogues;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("HandScoreInfoList")
        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoList handScoreInfoList;

        @NameInMap("Vid")
        public Integer vid;

        @NameInMap("ReviewNumber")
        public Integer reviewNumber;

        public static ReviewSingleResultByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReviewSingleResultByIdResponseBodyData self = new ReviewSingleResultByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReviewSingleResultByIdResponseBodyData setAudioURL(String audioURL) {
            this.audioURL = audioURL;
            return this;
        }
        public String getAudioURL() {
            return this.audioURL;
        }

        public ReviewSingleResultByIdResponseBodyData setHitNumber(Integer hitNumber) {
            this.hitNumber = hitNumber;
            return this;
        }
        public Integer getHitNumber() {
            return this.hitNumber;
        }

        public ReviewSingleResultByIdResponseBodyData setNextVid(String nextVid) {
            this.nextVid = nextVid;
            return this;
        }
        public String getNextVid() {
            return this.nextVid;
        }

        public ReviewSingleResultByIdResponseBodyData setPreVid(String preVid) {
            this.preVid = preVid;
            return this;
        }
        public String getPreVid() {
            return this.preVid;
        }

        public ReviewSingleResultByIdResponseBodyData setIsAudio(Boolean isAudio) {
            this.isAudio = isAudio;
            return this;
        }
        public Boolean getIsAudio() {
            return this.isAudio;
        }

        public ReviewSingleResultByIdResponseBodyData setHitRuleReviewInfoList(ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList) {
            this.hitRuleReviewInfoList = hitRuleReviewInfoList;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataHitRuleReviewInfoList getHitRuleReviewInfoList() {
            return this.hitRuleReviewInfoList;
        }

        public ReviewSingleResultByIdResponseBodyData setAudio(Boolean audio) {
            this.audio = audio;
            return this;
        }
        public Boolean getAudio() {
            return this.audio;
        }

        public ReviewSingleResultByIdResponseBodyData setAsrWordsCount(Integer asrWordsCount) {
            this.asrWordsCount = asrWordsCount;
            return this;
        }
        public Integer getAsrWordsCount() {
            return this.asrWordsCount;
        }

        public ReviewSingleResultByIdResponseBodyData setTotalScore(Integer totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public Integer getTotalScore() {
            return this.totalScore;
        }

        public ReviewSingleResultByIdResponseBodyData setBusinessType(Integer businessType) {
            this.businessType = businessType;
            return this;
        }
        public Integer getBusinessType() {
            return this.businessType;
        }

        public ReviewSingleResultByIdResponseBodyData setManualScoreMappingList(ReviewSingleResultByIdResponseBodyDataManualScoreMappingList manualScoreMappingList) {
            this.manualScoreMappingList = manualScoreMappingList;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataManualScoreMappingList getManualScoreMappingList() {
            return this.manualScoreMappingList;
        }

        public ReviewSingleResultByIdResponseBodyData setFileMergeName(String fileMergeName) {
            this.fileMergeName = fileMergeName;
            return this;
        }
        public String getFileMergeName() {
            return this.fileMergeName;
        }

        public ReviewSingleResultByIdResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ReviewSingleResultByIdResponseBodyData setDialogues(ReviewSingleResultByIdResponseBodyDataDialogues dialogues) {
            this.dialogues = dialogues;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataDialogues getDialogues() {
            return this.dialogues;
        }

        public ReviewSingleResultByIdResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ReviewSingleResultByIdResponseBodyData setHandScoreInfoList(ReviewSingleResultByIdResponseBodyDataHandScoreInfoList handScoreInfoList) {
            this.handScoreInfoList = handScoreInfoList;
            return this;
        }
        public ReviewSingleResultByIdResponseBodyDataHandScoreInfoList getHandScoreInfoList() {
            return this.handScoreInfoList;
        }

        public ReviewSingleResultByIdResponseBodyData setVid(Integer vid) {
            this.vid = vid;
            return this;
        }
        public Integer getVid() {
            return this.vid;
        }

        public ReviewSingleResultByIdResponseBodyData setReviewNumber(Integer reviewNumber) {
            this.reviewNumber = reviewNumber;
            return this;
        }
        public Integer getReviewNumber() {
            return this.reviewNumber;
        }

    }

}
