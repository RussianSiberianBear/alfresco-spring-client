package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestStats {
    private String field;

    private String label;

    private Boolean min;

    private Boolean max;

    private Boolean sum;

    private Boolean countValues;

    private Boolean missing;

    private Boolean mean;

    private Boolean stddev;

    private Boolean sumOfSquares;

    private Boolean distinctValues;

    private Boolean countDistinct;

    private Boolean cardinality;

    private Double cardinalityAccuracy;

    private List<String> excludeFilters;

    private List<Double> percentiles;

    public RequestStats() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getMin() {
        return min;
    }

    public void setMin(Boolean min) {
        this.min = min;
    }

    public Boolean getMax() {
        return max;
    }

    public void setMax(Boolean max) {
        this.max = max;
    }

    public Boolean getSum() {
        return sum;
    }

    public void setSum(Boolean sum) {
        this.sum = sum;
    }

    public Boolean getCountValues() {
        return countValues;
    }

    public void setCountValues(Boolean countValues) {
        this.countValues = countValues;
    }

    public Boolean getMissing() {
        return missing;
    }

    public void setMissing(Boolean missing) {
        this.missing = missing;
    }

    public Boolean getMean() {
        return mean;
    }

    public void setMean(Boolean mean) {
        this.mean = mean;
    }

    public Boolean getStddev() {
        return stddev;
    }

    public void setStddev(Boolean stddev) {
        this.stddev = stddev;
    }

    public Boolean getSumOfSquares() {
        return sumOfSquares;
    }

    public void setSumOfSquares(Boolean sumOfSquares) {
        this.sumOfSquares = sumOfSquares;
    }

    public Boolean getDistinctValues() {
        return distinctValues;
    }

    public void setDistinctValues(Boolean distinctValues) {
        this.distinctValues = distinctValues;
    }

    public Boolean getCountDistinct() {
        return countDistinct;
    }

    public void setCountDistinct(Boolean countDistinct) {
        this.countDistinct = countDistinct;
    }

    public Boolean getCardinality() {
        return cardinality;
    }

    public void setCardinality(Boolean cardinality) {
        this.cardinality = cardinality;
    }

    public Double getCardinalityAccuracy() {
        return cardinalityAccuracy;
    }

    public void setCardinalityAccuracy(Double cardinalityAccuracy) {
        this.cardinalityAccuracy = cardinalityAccuracy;
    }

    public List<String> getExcludeFilters() {
        return excludeFilters;
    }

    public void setExcludeFilters(List<String> excludeFilters) {
        this.excludeFilters = excludeFilters;
    }

    public List<Double> getPercentiles() {
        return percentiles;
    }

    public void setPercentiles(List<Double> percentiles) {
        this.percentiles = percentiles;
    }

}
