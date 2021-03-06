package ua.com.alevel.entity;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {

    @AttributeOverride(name = "id", column = @Column(name = "transaction_id"))

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    private String category;
    private Long sum;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }
}
