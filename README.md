                <h1>Picture Fetcher Microservice</h1>
                
                <p>This is a simple service built with SpringBoot and PostgreSQL that will retrieve some
                    of my favorite vacation pictures based on a given location.
                    <br>The service will return a JSON with
                    with the picture objects that belong to the location passed as parameter.</p>
                <h3>Valid Locations are:</h3>
                <ul>
                    <li>PuertoRico</li>
                    <li>Usa</li>
                    <li>Iceland</li>
                    <li>Spain</li>
                </ul>
                <h3>Usage Example</h3>
                <p>Try making a request to the following endpoint: <b>/pictures/vacation/<mark>{location}</mark></b></p>
                <h3>Sample Response JSON</h3>
                <p><mark>{
                <br>"sourceUrl": "https://picsfetcher.s3.amazonaws.com/151556.jpg",
                <br>"title": "Window Cave",
                <br>"description": "Cueva ventana en Arecibo PR",
                <br>"geoLocation": "PUERTORICO",
                <br>"category": "Scenery"
                <br>}</mark>
                </p>
