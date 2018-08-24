/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TRANSCACTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transcaction.findAll", query = "SELECT t FROM Transcaction t")
    , @NamedQuery(name = "Transcaction.findById", query = "SELECT t FROM Transcaction t WHERE t.id = :id")
    , @NamedQuery(name = "Transcaction.findByTransactionName", query = "SELECT t FROM Transcaction t WHERE t.transactionName = :transactionName")
    , @NamedQuery(name = "Transcaction.findByTransactionAmount", query = "SELECT t FROM Transcaction t WHERE t.transactionAmount = :transactionAmount")
    , @NamedQuery(name = "Transcaction.findByReceiverId", query = "SELECT t FROM Transcaction t WHERE t.receiverId = :receiverId")
    , @NamedQuery(name = "Transcaction.findBySenderId", query = "SELECT t FROM Transcaction t WHERE t.senderId = :senderId")
    , @NamedQuery(name = "Transcaction.findByTransactionFee", query = "SELECT t FROM Transcaction t WHERE t.transactionFee = :transactionFee")
    , @NamedQuery(name = "Transcaction.findByTransactionDate", query = "SELECT t FROM Transcaction t WHERE t.transactionDate = :transactionDate")
    , @NamedQuery(name = "Transcaction.findByReceiveAmount", query = "SELECT t FROM Transcaction t WHERE t.receiveAmount = :receiveAmount")
    , @NamedQuery(name = "Transcaction.findBySendAmount", query = "SELECT t FROM Transcaction t WHERE t.sendAmount = :sendAmount")
    , @NamedQuery(name = "Transcaction.findByBiillId", query = "SELECT t FROM Transcaction t WHERE t.biillId = :biillId")})
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "TRANSACTION_NAME")
    private String transactionName;
    @Column(name = "TRANSACTION_AMOUNT")
    private Integer transactionAmount;
    @Column(name = "RECEIVER_ID")
    private Integer receiverId;
    @Column(name = "SENDER_ID")
    private Integer senderId;
    @Column(name = "TRANSACTION_FEE")
    private Integer transactionFee;
    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.DATE)
    private Date transactionDate;
    @Column(name = "RECEIVE_AMOUNT")
    private Integer receiveAmount;
    @Column(name = "SEND_AMOUNT")
    private Integer sendAmount;
    @Size(max = 20)
    @Column(name = "BIILL_ID")
    private String biillId;

    public Transaction() {
    }

    public Transaction(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public Integer getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(Integer transactionFee) {
        this.transactionFee = transactionFee;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(Integer receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public Integer getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(Integer sendAmount) {
        this.sendAmount = sendAmount;
    }

    public String getBiillId() {
        return biillId;
    }

    public void setBiillId(String biillId) {
        this.biillId = biillId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Transcaction[ id=" + id + " ]";
    }
    
}
