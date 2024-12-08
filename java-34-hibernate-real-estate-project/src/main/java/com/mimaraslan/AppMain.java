package com.mimaraslan;

import com.mimaraslan.dao.AgentDAO;
import com.mimaraslan.dao.BuyerDAO;
import com.mimaraslan.dao.PropertyDAO;
import com.mimaraslan.dao.SellerDAO;
import com.mimaraslan.model.*;

import java.math.BigDecimal;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        Agent agent = new Agent();
        Buyer buyer = new Buyer();
        Seller seller = new Seller();
        Property property = new Property();

        AgentDAO agentDAO = new AgentDAO();
        BuyerDAO buyerDAO = new BuyerDAO();
        SellerDAO sellerDAO = new SellerDAO();
        PropertyDAO propertyDAO = new PropertyDAO();


        agent.setFirstName("Ahmet");
        agent.setLastName("Vatansever");
        agent.setEmail("aaa@gmail.com");
        agent.setPassword("111111");
        agent.setUsername("ahmet123");
        agent.setRating(4.8f);
        agent.setPhone("111-222-333");
        agent.setOfficeAddress("Ankara");

        System.out.println("--SAVE------------------------------");
        // SAVE INSERT CREATE
        agentDAO.saveOrUpdateAgent(agent);

                         // READ SELECT
        Agent findInfo = agentDAO.getAgentFindById(1L);

        System.out.println(findInfo.getId());
        System.out.println(findInfo.getFirstName());
        System.out.println(findInfo.getLastName());
        System.out.println(findInfo.getEmail());
        System.out.println(findInfo.getPhone());
        System.out.println(findInfo.getPassword());
        System.out.println(findInfo.getUsername());
        System.out.println(findInfo.getRating());
        System.out.println(findInfo.getOfficeAddress());

        agent.setId(1L);
        agent.setRating(4.9f);
        agent.setPhone("5555-2111-333");

        System.out.println("--UPDATE------------------------------");
        // UPDATE EDIT
        agentDAO.saveOrUpdateAgent(agent);

        // READ SELECT
        findInfo = agentDAO.getAgentFindById(1L);

        System.out.println(findInfo.getId());
        System.out.println(findInfo.getFirstName());
        System.out.println(findInfo.getLastName());
        System.out.println(findInfo.getEmail());
        System.out.println(findInfo.getPhone());
        System.out.println(findInfo.getPassword());
        System.out.println(findInfo.getUsername());
        System.out.println(findInfo.getRating());
        System.out.println(findInfo.getOfficeAddress());

        System.out.println("--DELETE------------------------------");
        System.out.println(agentDAO.deleteAgentFindById(1000L));
     //   System.out.println(agentDAO.deleteAgentFindById(1L));


        System.out.println("--BUYERS------------------------------");

        buyer.setFirstName("Süleyman");
        buyer.setLastName("Kesik");
        buyer.setEmail("ss@gmail.com");
        buyer.setPassword("122211111");
        buyer.setUsername("slm123");
        buyer.setRating(3.3f);
        buyer.setPhone("444-212-333");

        buyerDAO.saveOrUpdateBuyer(buyer);


        Buyer buyer2 = new Buyer();
        buyer2.setFirstName("Cemre");
        buyer2.setLastName("Gök");
        buyer2.setEmail("ccc@gmail.com");
        buyer2.setPassword("3331111");
        buyer2.setUsername("cmr06");
        buyer2.setRating(4.2f);
        buyer2.setPhone("224-312-333");

        buyerDAO.saveOrUpdateBuyer(buyer2);


        System.out.println("--SELLERS------------------------------");

        seller.setFirstName("Fatih");
        seller.setLastName("Deniz");
        seller.setEmail("fff@gmail.com");
        seller.setPassword("77777");
        seller.setUsername("fatih49");
        seller.setPhone("4999-212-333");

        sellerDAO.saveOrUpdateSeller(seller);

        Seller seller2 = new Seller();
        seller2.setFirstName("Emre");
        seller2.setLastName("Cerrah");
        seller2.setEmail("eeeee@gmail.com");
        seller2.setPassword("88888");
        seller2.setUsername("eeee1111");
        seller2.setPhone("999-777-333");

        sellerDAO.saveOrUpdateSeller(seller2);

        System.out.println("--PROPERTIES------------------------------");

        property.setPropertyName("Malikane");
        property.setTitle("Triplex");
        property.setDescription("Triple Property");
        property.setType("Home");
        property.setLocation("Ankara");
        property.setPrice(BigDecimal.valueOf(2_000_000));

        property.setAgent(agent);
        property.setSeller(seller);

        propertyDAO.saveOrUpdateProperty(property);



        Property property2 = new Property();
        property2.setPropertyName("Köşk");
        property2.setTitle("Dublex");
        property2.setDescription("Cool Property");
        property2.setType("Home");
        property2.setLocation("İzmir");
        property2.setPrice(BigDecimal.valueOf(1_300_000));

        property2.setAgent(agent);
        property2.setSeller(seller2);

        propertyDAO.saveOrUpdateProperty(property2);


        Agent agent2 = new Agent();
        agent2.setFirstName("Burhan");
        agent2.setLastName("Bey");
        agent2.setEmail("bbbb@gmail.com");
        agent2.setPassword("3333");
        agent2.setUsername("bbbbbwswerew");
        agent2.setRating(4.8f);
        agent2.setPhone("4565-222-333");
        agent2.setOfficeAddress("İstanbul");

        agentDAO.saveOrUpdateAgent(agent2);


        System.out.println("-- AGENT listesini getir------------------------------");

        List<Agent> agentList = agentDAO.getAgentFindAll();

        for (Agent oneAgent : agentList) {
            System.out.println(oneAgent.getId() + " " +  oneAgent.getFirstName() + " " + oneAgent.getLastName());
        }

        System.out.println("-- SELLER listesini getir------------------------------");

        List<Seller> sellerList = sellerDAO.getSellerFindAll();

        for (Seller oneSeller : sellerList) {
            System.out.println(oneSeller.getFirstName() + " " + oneSeller.getLastName());
        }


        System.out.println("-- BUYER listesini getir------------------------------");

        List<Buyer> buyerList = buyerDAO.getBuyerFindAll();

        for (Buyer oneBuyer : buyerList) {
            System.out.println(oneBuyer.getFirstName() + " " + oneBuyer.getLastName());
        }


        System.out.println("-- Properties listesini getir------------------------------");

        List<Property> propertiyList = propertyDAO.getPropertyFindAll();

        for (Property oneProperty : propertiyList) {
            System.out.println(oneProperty.getPropertyName() + " " + oneProperty.getTitle());
        }


        System.out.println("-- AGENT DELETE ------------------------------");

        agentDAO.deleteAgentFindById(2L);

        agentList = agentDAO.getAgentFindAll();

        for (Agent oneAgent : agentList) {
            System.out.println(oneAgent.getId() + " " +  oneAgent.getFirstName() + " " + oneAgent.getLastName());
        }


        System.out.println("-- BUYER id değerine göre bulamacağız ------------------------------");

        buyer = buyerDAO.getBuyerFindById(2L);

        if (buyer != null) {
            System.out.println(buyer.getId() + " " + buyer.getFirstName() + " " + buyer.getLastName());
        } else {
            System.out.println("Not found");
        }



    }
}
