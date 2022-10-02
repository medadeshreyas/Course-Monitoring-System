package com.masai.dao;

import java.util.List;

import com.masai.bean.Batch;
import com.masai.exceptions.BatchException;

public interface BatchDao {

	public String createBatch(Batch batch);

	public String deleteBatch(String batch_id);

	public String updateBatch(String batch_id,int no_of_students);

	public List<Batch> viewBatch() throws BatchException;

}
