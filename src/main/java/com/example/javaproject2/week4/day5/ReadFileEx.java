package com.example.javaproject2.week4.day5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 콘솔에서 읽어오기
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pc\\Desktop\\멋사\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10..csv"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./hospital_info_0920.csv"), "EUC-KR")); //한글 파일 인코딩 문제 해결하는 방법
        //BufferedReader 선언 -> File 연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        //BufferedReade에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("hospital_info_10lines.csv");
        List<Hospital> parsedHospital = rfe.getHospitals(strLines);
        for (int i = 0; i < parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(), hospital.getAddress().getFullAddr());
        }
    }
}
