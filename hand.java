public class Hand {

	    private String state;


	        public void setState(String state) {

			        switch (state) {

					            case "Grabbing":
					            	case "Waving":
					            		case "Pointing":
							                case "Typing":
							                    this.state = state;
									                    break;
											                default:
											                    this.state = "Open";


													            }

				        System.out.println("State is set to " + this.state);

					    }

		    public String getState(){
			            return this.state;
				        }

		System.out.println("Hi, here are my changes")
}



