package com.metehan.ImageService.Config;

import com.metehan.ImageService.Service.MetadataService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MetadataExtractorFilter {
    private final MetadataService metadataService;

//    @Override
//    protected void doFilterInternal(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, jakarta.servlet.FilterChain filterChain) throws ServletException, IOException {
//
//    }
}
