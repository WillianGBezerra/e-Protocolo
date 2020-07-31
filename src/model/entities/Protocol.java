package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Protocol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String number;
	private Date dateProtocol;
	private Integer invoice;
	private Date dateissue;
	private String llave;
	private String orders;
	private String paymentCondition;
	private String paymentConditionValidation;

	private Provider provider;
	private User user;
	private Department department;

	public Protocol() {

	}

	public Protocol(Integer id, String number, Date dateProtocol, Integer invoice, Date dateissue, String llave,
			String orders, String paymentCondition, String paymentConditionValidation, Provider provider, User user,
			Department department) {
		super();
		this.id = id;
		this.number = number;
		this.dateProtocol = dateProtocol;
		this.invoice = invoice;
		this.dateissue = dateissue;
		this.llave = llave;
		this.orders = orders;
		this.paymentCondition = paymentCondition;
		this.paymentConditionValidation = paymentConditionValidation;
		this.provider = provider;
		this.user = user;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDateProtocol() {
		return dateProtocol;
	}

	public void setDateProtocol(Date dateProtocol) {
		this.dateProtocol = dateProtocol;
	}

	public Integer getInvoice() {
		return invoice;
	}

	public void setInvoice(Integer invoice) {
		this.invoice = invoice;
	}

	public Date getDateissue() {
		return dateissue;
	}

	public void setDateissue(Date dateissue) {
		this.dateissue = dateissue;
	}

	public String getLlave() {
		return llave;
	}

	public void setLlave(String llave) {
		this.llave = llave;
	}

	public String getOrder() {
		return orders;
	}

	public void setOrders(String orders) {
		this.orders = orders;
	}

	public String getPaymentCondition() {
		return paymentCondition;
	}

	public void setPaymentCondition(String paymentCondition) {
		this.paymentCondition = paymentCondition;
	}

	public String getPaymentConditionValidation() {
		return paymentConditionValidation;
	}

	public void setPaymentConditionValidation(String paymentConditionValidation) {
		this.paymentConditionValidation = paymentConditionValidation;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Protocol other = (Protocol) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Protocol [id=");
		builder.append(id);
		builder.append(", number=");
		builder.append(number);
		builder.append(", dateProtocol=");
		builder.append(dateProtocol);
		builder.append(", invoice=");
		builder.append(invoice);
		builder.append(", dateissue=");
		builder.append(dateissue);
		builder.append(", key=");
		builder.append(llave);
		builder.append(", Order=");
		builder.append(orders);
		builder.append(", PaymentCondition=");
		builder.append(paymentCondition);
		builder.append(", PaymentConditionValidation=");
		builder.append(paymentConditionValidation);
		builder.append(", provider=");
		builder.append(provider);
		builder.append(", user=");
		builder.append(user);
		builder.append(", department=");
		builder.append(department);
		builder.append("]");
		return builder.toString();
	}
}
