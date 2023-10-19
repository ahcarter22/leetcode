package org.example;

public class UniqueEmailAdresses {
    public int numUniqueEmails(String[] emails) {
        // create a new hashset to store unique email addresses
        Set<String> uniqueEmails = new HashSet<>();
        // iterate through the array of email addresses
        for (String email : emails) {
            // split the email address into local and domain parts
            String[] parts = email.split("@");
            // split the local part into local name and local domain
            String[] local = parts[0].split("\\+");
            // remove all periods from the local name
            String localName = local[0].replace(".", "");
            // add the local name and domain name back together
            String newEmail = localName + "@" + parts[1];
            // add the new email address to the hashset
            uniqueEmails.add(newEmail);
        }
        // return the number of unique email addresses
        return uniqueEmails.size();
    }
}
