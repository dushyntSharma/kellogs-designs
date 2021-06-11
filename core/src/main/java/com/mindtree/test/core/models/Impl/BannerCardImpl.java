package com.mindtree.test.core.models.Impl;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import com.mindtree.test.core.models.BannerCard;

@Model(adaptables = Resource.class, adapters = BannerCard.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerCardImpl implements BannerCard {

	@Inject
	String title;

	@Inject
	String description;

	@Inject
	String fileReference;

	@Inject
	String prepTime;

	@Inject
	String totalTime;

	@Inject
	String servings;

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getFilePath() {
		return fileReference;
	}

	@Override
	public String getPrepTime() {

		return prepTime;
	}

	@Override
	public String getTotalTime() {

		return totalTime;
	}

	@Override
	public String getServings() {

		return servings;
	}

}