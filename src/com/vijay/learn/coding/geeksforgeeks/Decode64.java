package com.vijay.learn.coding.geeksforgeeks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Decode64 {
  public static void main(String[] args) {
    System.out.println("replayService  :  " + new String(Base64.getDecoder().
        decode("QTE5WVNYZmBNVSxFWEVDVVRFLEVYRUNVVElPTl9QUk9HUkVTUw=="), StandardCharsets.UTF_8));

    System.out.println("riskCaseManagementQueueManagement  :  " + new String(Base64.getDecoder().
        decode("cmNtcW1SdWxlRSxFWEVDVVRFLFJVTEVTRVRfUkVBRCxSVUxFX0NSVUQ="), StandardCharsets.UTF_8));

    System.out.println("ruleEngineTest  :  " + new String(Base64.getDecoder().
        decode("YmE2NDU3YmQsVEVTVCxSVUxFX0NSVUQsUlVMRVNFVF9DUlVELENBQ0hFLEFUVFJJQlVURQ=="), StandardCharsets.UTF_8));

    System.out.println("ruleEngineTestExecute  :  " + new String(Base64.getDecoder().
        decode("MmMwZDA2Y2IsRVhFQ1VURSxBVFRSSUJVVEVfUkVBRCxSVUxFU0VUX1JFQUQ="), StandardCharsets.UTF_8));

    System.out.println("ruleEngineUI  :  " + new String(Base64.getDecoder().
        decode("MTJmZGVkNDksVEVTVCxSVUxFX0NSVUQsUlVMRVNFVF9DUlVELENBQ0hFLEFUVFJJQlVURQ=="), StandardCharsets.UTF_8));

    System.out.println("strategyEngine  :  " + new String(Base64.getDecoder().
        decode("YTcwODAzYWIsRVhFQ1VURSxBVFRSSUJVVEVfUkVBRCxSVUxFU0VUX1JFQUQ="), StandardCharsets.UTF_8));

    System.out.println("strategyManagementService  :  " + new String(Base64.getDecoder().
        decode("YTcwODAzYWIsUlVMRVNFVF9SRUFE"), StandardCharsets.UTF_8));

    System.out.println("datasource_password  :  " + new String(Base64.getDecoder().
        decode("c3Fs"), StandardCharsets.UTF_8));

  }
}
