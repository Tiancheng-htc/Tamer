package com.astrium.faceo.client.bean.programming.sps2.request;

import java.io.Serializable;

/**
public class TemporalSeriesBean implements Serializable {

    /**
    private static final long serialVersionUID = -96297644701715632L;

    /** survey Period 
    private SurveyPeriodBean surveyPeriod = new SurveyPeriodBean();

    /** Occurences : Number of times the region should be fully covered. */
    private int Occurences = 0;

    /** Periodicity Range Min */
    private float periodicityMin = 0;

    /** Periodicity Range Max */
    private float periodicityMax = 0;

    /** Latest start : Date */
    private String latestStart = null;

    /**
    public TemporalSeriesBean() {
    }

    /** 
    public SurveyPeriodBean getSurveyPeriod() {
        return this.surveyPeriod;
    }

    /** 
    public int getOccurences() {
        return this.Occurences;
    }

    /** 
    public float getPeriodicityMin() {
        return this.periodicityMin;
    }

    /** 
    public float getPeriodicityMax() {
        return this.periodicityMax;
    }

    /** 
    public String getLatestStart() {
        return (this.latestStart != null) ? this.latestStart : "";
    }

    /** 
    public void setSurveyPeriod(SurveyPeriodBean _surveyPeriod) {
        this.surveyPeriod = _surveyPeriod;
    }

    /** 
    public void setOccurences(int _occurences) {
        this.Occurences = _occurences;
    }

    /** 
    public void setPeriodicityMin(float _periodicityMin) {
        this.periodicityMin = _periodicityMin;
    }

    /** 
    public void setPeriodicityMax(float _periodicityMax) {
        this.periodicityMax = _periodicityMax;
    }

    /** 
    public void setLatestStart(String _latestStart) {
        this.latestStart = _latestStart;
    }
}