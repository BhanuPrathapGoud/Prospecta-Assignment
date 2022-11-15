package com.prospecta.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicApiDTO {
	private String title;
	private String description;
	private String category;
}
