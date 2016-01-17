package com.pdt.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import com.pdt.model.Eligible;
import com.pdt.model.EligibleList;
import com.pdt.util.HibernateUtil;

public class App1 {

	private static final String parth = "D:\\conf\\pdt\\";
	private static final String fileName = "input.csv";
	private static final String fullParth = parth+fileName;

	public static void main(String[] args) throws IOException {

		// File file = new File(parth);
		BufferedReader reader = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
//		List<Eligible> eligibles = new ArrayList<Eligible>();
		try {
			
			EligibleList eligibleList = new EligibleList();
			eligibleList.setFileName(fileName);
			eligibleList.setUploadDate(new Date());
			session.save(eligibleList);
			
			// reader = new BufferedReader(new FileReader(file));
			reader = new BufferedReader(new FileReader(fullParth));
			String line = null;
			int i =0;
			while ((line = reader.readLine()) != null) {
				if ((line.startsWith("1"))) {
					System.out.println(line);
//					eligibles.add(getEligibleBean(line,i));
					session.merge(getEligibleBean(line,i));
					i++;
				}
			}
				
//			EligibleList eligibleList = new EligibleList();
//			eligibleList.setFileName(fileName);
			eligibleList.setRecordAmount(String.valueOf(i));
//			eligibleList.setUploadDate(new Date());
			session.merge(eligibleList);
				
				session.getTransaction().commit();
				System.out.println("##commit");
			 
		} catch (FileNotFoundException e) {
			System.out.println("##rolback");
			e.printStackTrace();
		} catch(ConstraintViolationException e){
			System.out.println("##rolback");
			System.out.println("##error:"+e.getMessage()+"="+e.getSQLException());
//			e.printStackTrace();
		}
		finally {
			reader.close();
		}
	}

	public static Eligible getEligibleBean(String str ,int i) {
		Eligible eligible = new Eligible();
		if (StringUtils.isNotBlank(str)) {
			String[] strs = str.split(",(?=([^\"]|\"[^\"]*\")*$)");
//			System.out.println(strs.length);
			if (strs.length > 20) {
//				System.out.println("Add");
//				System.out.println(strs[20]);
				eligible.setEligibleId(i);
				eligible.setCidCardNo(Integer.valueOf(strs[0]));
				eligible.setTaxId(Integer.valueOf(strs[1]));
				eligible.setAccountNumber(Integer.valueOf(strs[2]));
				eligible.setCardNumber(Integer.valueOf(strs[3]));
				eligible.setTitle(strs[4]);
				eligible.setCustomerName(strs[5]);
				eligible.setAddress0(strs[6]);
				eligible.setAddress1(strs[7]);
				eligible.setAddress2(strs[8]);
				eligible.setAddress3(strs[9]);
				eligible.setZipCode(Integer.valueOf(strs[10]));
				eligible.setCampaignCode(strs[11]);
				eligible.setCampaignname(strs[12]);
				eligible.setCampaignStart(strs[13]);
				eligible.setCampaignEnd(strs[14]);
				eligible.setItemCode(strs[15]);
				eligible.setItemname(StringUtils.isNotBlank(strs[16])?strs[16].replaceAll("\"",""):null);
				eligible.setSmsCode(strs[17]);
				eligible.setSubInventory(strs[18]);
				eligible.setDeliveryFlag(strs[19]);
				eligible.setVipFlag(strs[20]);
				eligible.setRemarks(strs.length>21?strs[21]:null);
			}
		}
		return eligible;
	}

}
