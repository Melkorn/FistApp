import java.util.Scanner;

/* class Hotel {
	
	String city;
	int rooms_number;
	short gwiazdki;
	short price;
} */

public class App {

	public static void main(String[] args) {
		String hotel1 = "Grand Hotel New York";
		String hotel2 = "Grand Hotel Warsaw";
		String hotel3 = "Grand Hotel Los Angeles";
		String hotel4 = "Grand Hotel Poznan";
		
		System.out.println("Hello, Welcome in Grand Hotel by Melkorn booking system!");
		Scanner hotel = new Scanner(System.in);
boolean ok = false;
while (!ok) 
{
	System.out.println(" Please choose your hotel: " + hotel1 + "  " + hotel2 + "  " + hotel3 + " " + hotel4);
	String city = hotel.nextLine();

	switch (city) {
				case "Grand Hotel New York": {
					System.out.println("Witaj w " + city);
					System.out.println(" Do you want to book a room in this hotel? ");
					String odp = hotel.nextLine();
						switch (odp) {
						default: {
							break;
						}
						case "yes":{
							System.out.println(" Please choose Your standard: ");
							System.out.println(" Economic  |  Premium  |  VIP ");
							String standard = hotel.nextLine();
								switch (standard) {
								case "Economic": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									hotel.nextLine();
									int cost = days*100;
									
															
									System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );											
								
									String ans = hotel.nextLine();	
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								case "Premium": {
									System.out.println(" This room costs 175 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*175;
																		
									System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								case "VIP": {
									System.out.println(" This room costs 300 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*300;
																		
									System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								default:{
									break;
								}
							}
						break;
						}	
						case "Yes":{
								System.out.println(" Please choose Your standard: ");
								System.out.println(" Economic  |  Premium  |  VIP ");
								String standard = hotel.nextLine();
									switch (standard) {
									case "Economic": {
										System.out.println(" This room costs 100 $ per night");
										System.out.println(" How many days would You like to stay in this room?");
										int days = hotel.nextInt(); hotel.nextLine();
										int cost = days*100;
																			
										System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																														
										String ans = hotel.nextLine();
										
										switch (ans) {
										case "Yes": {
											System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
										}
										case "yes": {
											System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
											break;
										}
										case "No": {
											System.out.println(" You have canceled Your reservation");
											break;
										}
										case "no": {
											System.out.println(" You have canceled Your reservation");
											break;
										}
										
										}
									
									break;
									}
									case "Premium": {
										System.out.println(" This room costs 100 $ per night");
										System.out.println(" How many days would You like to stay in this room?");
										int days = hotel.nextInt(); hotel.nextLine();
										int cost = days*175;
																			
										System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																														
										String ans = hotel.nextLine();
										
										switch (ans) {
										case "Yes": {
											System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
										}
										case "yes": {
											System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
											break;
										}
										case "No": {
											System.out.println(" You have canceled Your reservation");
											break;
										}
										case "no": {
											System.out.println(" You have canceled Your reservation");
											break;
										}
										
										}
									
									break;
									}
									case "VIP": {
										System.out.println(" This room costs 100 $ per night");
										System.out.println(" How many days would You like to stay in this room?");
										int days = hotel.nextInt(); hotel.nextLine();
										int cost = days*300;
																			
										System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																														
										String ans = hotel.nextLine();
										
										switch (ans) {
										case "Yes": {
											System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
										}
										case "yes": {
											System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
											break;
										}
										case "No": {
											System.out.println(" You have canceled Your reservation");
											break;
										}
										case "no": {
											System.out.println(" You have canceled Your reservation");
											break;
										}
										
										}
									
									break;
									}
									
								
								}
							break;
							}	
				
						}
					
					break;
					}
			case "Grand Hotel Warsaw":{
				System.out.println("Witaj w " + city);
				System.out.println(" Do you want to book a room in this hotel? ");
				String odp = hotel.nextLine();
					switch (odp) {
					case "yes":{
						System.out.println(" Please choose Your standard: ");
						System.out.println(" Economic  |  Premium  |  VIP ");
						String standard = hotel.nextLine();
							switch (standard) {
							case "Economic": {
								System.out.println(" This room costs 100 $ per night");
								System.out.println(" How many days would You like to stay in this room?");
								int days = hotel.nextInt(); hotel.nextLine();
								int cost = days*100;
																	
								System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																												
								String ans = hotel.nextLine();
								
								switch (ans) {
								case "Yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
								break;
								}
								case "yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
								}
								case "No": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								case "no": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								
								}
							
							break;
							}
							case "Premium": {
								System.out.println(" This room costs 175 $ per night");
								System.out.println(" How many days would You like to stay in this room?");
								int days = hotel.nextInt(); hotel.nextLine();
								int cost = days*175;
																	
								System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																												
								String ans = hotel.nextLine();
								
								switch (ans) {
								case "Yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
								break;
								}
								case "yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
								}
								case "No": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								case "no": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								
								}
							
							break;
							}
							case "VIP": {
								System.out.println(" This room costs 300 $ per night");
								System.out.println(" How many days would You like to stay in this room?");
								int days = hotel.nextInt(); hotel.nextLine();
								int cost = days*300;
																	
								System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																												
								String ans = hotel.nextLine();
								
								switch (ans) {
								case "Yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
								break;
								}
								case "yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
								}
								case "No": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								case "no": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								
								}
							
							break;
							}
							
						}
					break;
					}	
					case "Yes":{
							System.out.println(" Please choose Your standard: ");
							System.out.println(" Economic  |  Premium  |  VIP ");
							String standard = hotel.nextLine();
								switch (standard) {
								case "Economic": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*100;
																		
									System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								case "Premium": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*175;
																		
									System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								case "VIP": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*300;
																		
									System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								
							
							}
						break;
						}
						default:
							break;	
			
					}
				
				break;
				}
				
			case "Grand Hotel Poznan":{
				System.out.println("Witaj w " + city);
				System.out.println(" Do you want to book a room in this hotel? ");
				String odp = hotel.nextLine();
					switch (odp) {
					case "yes":{
						System.out.println(" Please choose Your standard: ");
						System.out.println(" Economic  |  Premium  |  VIP ");
						String standard = hotel.nextLine();
							switch (standard) {
							case "Economic": {
								System.out.println(" This room costs 100 $ per night");
								System.out.println(" How many days would You like to stay in this room?");
								int days = hotel.nextInt(); hotel.nextLine();
								int cost = days*100;
																	
								System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																												
								String ans = hotel.nextLine();
								
								switch (ans) {
								case "Yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
								break;
								}
								case "yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
								}
								case "No": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								case "no": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								
								}
							
							break;
							}
							case "Premium": {
								System.out.println(" This room costs 175 $ per night");
								System.out.println(" How many days would You like to stay in this room?");
								int days = hotel.nextInt(); hotel.nextLine();
								int cost = days*175;
																	
								System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																												
								String ans = hotel.nextLine();
								
								switch (ans) {
								case "Yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
								break;
								}
								case "yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
								}
								case "No": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								case "no": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								
								}
							
							break;
							}
							case "VIP": {
								System.out.println(" This room costs 300 $ per night");
								System.out.println(" How many days would You like to stay in this room?");
								int days = hotel.nextInt(); hotel.nextLine();
								int cost = days*300;
																	
								System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																												
								String ans = hotel.nextLine();
								
								switch (ans) {
								case "Yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
								break;
								}
								case "yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
								}
								case "No": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								case "no": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								
								}
							
							break;
							}
							
						}
					break;
					}	
					case "Yes":{
							System.out.println(" Please choose Your standard: ");
							System.out.println(" Economic  |  Premium  |  VIP ");
							String standard = hotel.nextLine();
								switch (standard) {
								case "Economic": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*100;
																		
									System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								case "Premium": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*175;
																		
									System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								case "VIP": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*300;
																		
									System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								
							
							}
						break;
						}
						default:
							break;	
			
					}
				
				break;
				}
			case"Grand Hotel Los Angeles":{
				System.out.println("Witaj w " + city);
				System.out.println(" Do you want to book a room in this hotel? ");
				String odp = hotel.nextLine();
					switch (odp) {
					case "yes":{
						System.out.println(" Please choose Your standard: ");
						System.out.println(" Economic  |  Premium  |  VIP ");
						String standard = hotel.nextLine();
							switch (standard) {
							case "Economic": {
								System.out.println(" This room costs 100 $ per night");
								System.out.println(" How many days would You like to stay in this room?");
								int days = hotel.nextInt(); hotel.nextLine();
								int cost = days*100;
																	
								System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																												
								String ans = hotel.nextLine();
								
								switch (ans) {
								case "Yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
								break;
								}
								case "yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
								}
								case "No": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								case "no": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								
								}
							
							break;
							}
							case "Premium": {
								System.out.println(" This room costs 175 $ per night");
								System.out.println(" How many days would You like to stay in this room?");
								int days = hotel.nextInt(); hotel.nextLine();
								int cost = days*175;
																	
								System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																												
								String ans = hotel.nextLine();
								
								switch (ans) {
								case "Yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
								break;
								}
								case "yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
								}
								case "No": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								case "no": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								
								}
							
							break;
							}
							case "VIP": {
								System.out.println(" This room costs 300 $ per night");
								System.out.println(" How many days would You like to stay in this room?");
								int days = hotel.nextInt(); hotel.nextLine();
								int cost = days*300;
																	
								System.out.println(" Do You want to book this room for next " + days + " days for " + cost + " $ ? " );
																												
								String ans = hotel.nextLine();
								
								switch (ans) {
								case "Yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
								break;
								}
								case "yes": {
									System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
								}
								case "No": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								case "no": {
									System.out.println(" You have canceled Your reservation");
									break;
								}
								
								}
							
							break;
							}
							
						}
					break;
					}	
					case "Yes":{
							System.out.println(" Please choose Your standard: ");
							System.out.println(" Economic  |  Premium  |  VIP ");
							String standard = hotel.nextLine();
								switch (standard) {
								case "Economic": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*100;
																		
									System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								case "Premium": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*175;
																		
									System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								case "VIP": {
									System.out.println(" This room costs 100 $ per night");
									System.out.println(" How many days would You like to stay in this room?");
									int days = hotel.nextInt(); hotel.nextLine();
									int cost = days*300;
																		
									System.out.println(" Do You want to book this room for next " + days + " for " + cost + " $ ? " );
																													
									String ans = hotel.nextLine();
									
									switch (ans) {
									case "Yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
									break;
									}
									case "yes": {
										System.out.println(" You have succesfully booked " + standard + " room for next  " + days + " days.");
										break;
									}
									case "No": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									case "no": {
										System.out.println(" You have canceled Your reservation");
										break;
									}
									
									}
								
								break;
								}
								
							
							}
						break;
						}
						default:
							break;	
			
					}
				
				break;
				}
			default:{
				System.out.println(" Error, hotel does not exist ");
				break;
				}
		}

	}
hotel.close();
}
}
