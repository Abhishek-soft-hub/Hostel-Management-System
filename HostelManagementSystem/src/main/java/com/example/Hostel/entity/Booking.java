package com.example.Hostel.entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payId;
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	@OneToOne
	@JoinColumn(name = "badId")
	private Beds beds;
	private LocalDate bookingDate;
	private int amount;
	private String paymentMethod;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Beds getBed() {
		return beds;
	}

	public void setBed(Beds bed) {
		this.beds = bed;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, beds, bookingDate, payId, paymentMethod, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return amount == other.amount && Objects.equals(beds, other.beds)
				&& Objects.equals(bookingDate, other.bookingDate) && payId == other.payId
				&& Objects.equals(paymentMethod, other.paymentMethod) && Objects.equals(user, other.user);
	}


}
