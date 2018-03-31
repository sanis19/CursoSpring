package com.privalia.presentation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor 
public class HelloWorldLombok {
	
	private @NonNull String hello;

}
