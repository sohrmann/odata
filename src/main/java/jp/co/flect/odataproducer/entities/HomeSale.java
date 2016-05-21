package jp.co.flect.odataproducer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import lombok.Data;

@Entity
@Data
@Table(name="home_sales")
public class HomeSale {

	@Id
	private Integer id;

	private String address;

	private String city;

	private String state;

	private Float longitude;

	private Float latitude;

	private Integer price;

}
