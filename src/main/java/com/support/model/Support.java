package com.support.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Suporte")
public class Support {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "Empresa", length = 120)
    private String company;

    @NotNull
    @Column(name = "Usuario", length = 120)
    private String user;

    @NotNull
    @Column(name = "Telefone", length = 30)
    private String phone;

    @NotNull
    @Column(name = "Email", length = 200)
    private String email;

    @NotNull
    @Column(name = "Classificacao", length = 120)
    private String classification;

    @NotNull
    @Column(name = "Descricao", length = 1000)
    private String description;

    @NotNull
    @Column(name = "Anydesk", length = 20)
    private String anyDesk;

    @Column(name = "Atendido", length = 3)
    private Long answered;

    @Column(name = "Atendente", length = 100)
    private String supportAttendant;

    @Column(name = "Resultado", length = 255)
    private String result;

    public Support() {
        super();
    }

    public Support(Long id, String company, String user, String phone, String email, String classification,
            String description, String anyDesk, Long answered, String supportAttendant, String result) {
        super();
        this.id = id;
        this.company = company;
        this.user = user;
        this.phone = phone;
        this.email = email;
        this.classification = classification;
        this.description = description;
        this.anyDesk = anyDesk;
        this.answered = answered;
        this.supportAttendant = supportAttendant;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnyDesk() {
        return anyDesk;
    }

    public void setAnyDesk(String anyDesk) {
        this.anyDesk = anyDesk;
    }

    public Long getAnswered() {
        return answered;
    }

    public void setAnswered(Long answered) {
        this.answered = answered;
    }

    public String getSupportAttendant() {
        return supportAttendant;
    }

    public void setSupportAttendant(String supportAttendant) {
        this.supportAttendant = supportAttendant;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
        Support other = (Support) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Suport [id=" + id + ", company=" + company + ", user=" + user + ", phone=" + phone + ", email=" + email
                + ", classification=" + classification + ", description=" + description + ", anyDesk=" + anyDesk
                + ", answered=" + answered + ", supportAttendant=" + supportAttendant + ", result=" + result
                + ", getId()=" + getId() + ", getCompany()=" + getCompany() + ", getUser()=" + getUser()
                + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getClassification()="
                + getClassification() + ", getDescription()=" + getDescription() + ", getAnyDesk()=" + getAnyDesk()
                + ", getAnswered()=" + getAnswered() + ", getSupportAttendant()=" + getSupportAttendant()
                + ", getResult()=" + getResult() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
                + ", toString()=" + super.toString() + "]";
    }

}
