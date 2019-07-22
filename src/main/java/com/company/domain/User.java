package com.company.domain;

import javax.persistence.*;

@Entity
@Table(name = "bets2")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer bet_id;

    private Integer user_id;

    private Integer event_id;

    private Integer bet;

    private Integer bet_points;

    private Integer points_result;

    public Integer getBet_id() {
        return bet_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

    public Integer getBet() {
        return bet;
    }

    public void setBet(Integer bet) {
        this.bet = bet;
    }

    public Integer getBet_points() {
        return bet_points;
    }

    public void setBet_points(Integer bet_points) {
        this.bet_points = bet_points;
    }

    public Integer getPoints_result() {
        return points_result;
    }

    public void setPoints_result(Integer points_result) {
        this.points_result = points_result;
    }

}