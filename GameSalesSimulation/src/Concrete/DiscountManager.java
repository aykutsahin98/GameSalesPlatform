package Concrete;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import Abstract.DiscountService;
import Entities.Discount;

public class DiscountManager implements DiscountService{

	public DiscountManager() {
		
	}

	@Override
	public void add(Discount discount) {
		System.out.println(discount.getDescription() + " kampanyas� tan�mland�");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getDescription() + " kampanyas� g�ncellendi");
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getDescription() + " kampanyas� silindi");
		
	}

	@Override
	public boolean validate(Discount discount) {
		LocalDateTime localDateTime= LocalDateTime.now();
		return discount.getDeadLine().after(Date.from( localDateTime.atZone
				( ZoneId.systemDefault()).toInstant()));
	}

}
