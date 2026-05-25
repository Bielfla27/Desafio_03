package desafio_crud.desafio_crud.dto;

import java.time.LocalDate;

public class ClientDto {

		private Long id;
	    private String name;
	    private String cpf;
	    private double income;
	    private LocalDate birthDate;
	    private Integer children;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getIncome() {
			return income;
		}
		public void setIncome(double income) {
			this.income = income;
		}
		public LocalDate getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
		}
		public Integer getChildren() {
			return children;
		}
		public void setChildren(Integer children) {
			this.children = children;
		}
}
