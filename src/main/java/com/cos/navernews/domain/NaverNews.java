package com.cos.navernews.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
@Document(collection = "naver_realtime")
public class NaverNews {
	@Id private String _id;
	private String company;
	private String title;
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private Date createdAt;
}
