package edu.mum.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import edu.mum.domain.Category;
import edu.mum.repository.CategoryRepository;

public class CategoryFormatter implements Formatter<Category> {

	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public String print(Category object, Locale locale) {
		return Integer.toString(object.getId());
	}

	@Override
	public Category parse(String text, Locale locale) throws ParseException {
		return categoryRepository.getCategory(Integer.parseInt(text));
	}



}
